package com.sfeir.devoxx.leap.impl;

import com.leapmotion.leap.*;
import com.leapmotion.leap.Vector;
import com.sfeir.devoxx.common.Command;
import com.sfeir.devoxx.leap.CommandListener;
import com.sfeir.devoxx.leap.LeapController;

import java.util.*;

/**
 * Simple implentation, stores the current command as a local variable.
 *
 * Date: 03/03/13
 *
 * @author François LAROCHE
 */
public class LeapControllerImpl extends Listener implements LeapController {

    private static final float MINIMUM_DISTANCE = 80;
    private static final float MINIMUM_Y_DISTANCE = 150;
    private static final float MINIMUM_VELOCITY = 30;
    private static final int MAX_SKIPABLE_FRAMES = 20;
    private static final long MIN_DELAY = 1000;

    private int nbSkipped = 0;
    private long lasCommand;
    private int mainHandId;
    private Command currentCommand;
    private Vector origin = null;
    private final Set<CommandListener> listeners;

    // Have controller as a variable, to avoid its destruction
    private final Controller controller;

    public LeapControllerImpl() {
        this.listeners = new HashSet<CommandListener>();
        this.controller = new Controller();
        this.controller.addListener(this);
        this.controller.enableGesture(Gesture.Type.TYPE_CIRCLE);
        this.lasCommand = System.currentTimeMillis();
    }

    @Override
    public void onFrame(Controller controller) {
        Frame frame = controller.frame();
        long time = System.currentTimeMillis();
        if(!canChangeCommand(time)) {
            return;
        }
        GestureList gestures = frame.gestures();
        if(gestures.count() > 0) {
            for(int i = 0; i < gestures.count(); i++) {
                Gesture gesture = gestures.get(i);
                if(gesture.type() == Gesture.Type.TYPE_CIRCLE && gesture.state() == Gesture.State.STATE_STOP) {
                    this.lasCommand = time;
                    for(CommandListener listener : this.listeners) {
                        this.currentCommand = Command.BLINK;
                        listener.onCommandChange(Command.BLINK);
                    }
                    return;
                }
            }
        }
        Collection<Hand> hands = cleanHands(frame.hands());
        switch (hands.size()) {
            default :
                this.nbSkipped ++;
                if(this.origin != null && this.nbSkipped > MAX_SKIPABLE_FRAMES) {
                    System.out.println("Resetting origin : nbHands = " + hands.size());
                    this.mainHandId = -1;
                    this.currentCommand = null;
                    this.origin = null;
                    for(CommandListener listener : this.listeners) {
                        listener.onResetOrigin();
                    }
                }
                break;
            case 1:
                this.nbSkipped = 0;
                Hand hand = hands.iterator().next();
                if(this.origin == null) {
                    this.origin = computeOrigin(hand);
                    if(this.origin != null) {
                        this.mainHandId = hand.id();
                        for(CommandListener listener : listeners) {
                            listener.onNewOrigin(this.origin);
                        }
                    }
                }
                else {
                    Command c = this.currentCommand;
                    this.currentCommand = computeCurrentCommand(hand);
                    if(c != this.currentCommand && this.currentCommand != null) {
                        this.lasCommand = time;
                        for(CommandListener listener : this.listeners) {
                            listener.onCommandChange(this.currentCommand);
                        }
                    }
                }
                break;
        }
    }

    @Override
    public Command getCurrentCommand() {
        return currentCommand;
    }

    private Vector computeOrigin(Hand hand) {
        if(hand.palmVelocity().magnitude() < MINIMUM_VELOCITY) {
            return hand.palmPosition();
        }
        return null;
    }

    private Command computeCurrentCommand(Hand hand)  {
        // check if hand has moved enough from the origin
        Vector palm = hand.palmPosition();

        if(palm.distanceTo(origin) > MINIMUM_DISTANCE) {
            // calculate difference on the Y axis, ie. the up / down axis
            float heightDifference = palm.getY() - this.origin.getY();
            if(Math.abs(heightDifference) > MINIMUM_Y_DISTANCE) {
                if(heightDifference < 0) {
                    return Command.SIT_DOWN;
                }
                else {
                    return Command.STAND_UP;
                }
            }
            // Axis left / right, positive = right
            float xDifference = palm.getX() - this.origin.getX();
            // Axis towards us or towards screen, positive = toward us
            float zDifference = palm.getZ() - this.origin.getZ();
            boolean moveX = Math.abs(xDifference) > MINIMUM_DISTANCE;
            boolean moveZ = Math.abs(zDifference) > MINIMUM_DISTANCE;

            if(moveX && moveZ) {
                // Do nothing, unable to understand what's needed
                return null;
            }
            if(moveX) {
                return xDifference > 0 ? Command.TURN_RIGHT : Command.TURN_LEFT;
            }
            if(moveZ) {
                return zDifference < 0 ? Command.MOVE_FORWARD : Command.MOVE_BACKWARDS;
            }
        }
        return null;
    }

    @Override
    public void addCommandListener(CommandListener listener) {
        this.listeners.add(listener);
    }

    private Collection<Hand> cleanHands(HandList list) {
        switch(list.count()) {
            case 0 :
                return Collections.emptyList();
            case 1 :
                Collection<Hand> result = new ArrayList<Hand>(1);
                result.add(list.get(0));
                return result;
            default:
                Hand defaultHand = null;
                for(int i = 0; i < list.count(); i++) {
                    Hand h = list.get(i);
                    if(this.mainHandId == h.id()) {
                        defaultHand = h;
                        break;
                    }
                }
                Collection<Hand> res = new ArrayList<Hand>(list.count());
                for(int i = 0; i < list.count(); i++) {
                    Hand h = list.get(i);
                    if(defaultHand == null) {
                        res.add(h);
                    }
                    else {
                        // Try to remove "phantom" hands, and keep real ones
                        Vector defaultPosition = defaultHand.palmPosition();
                        Vector handPosition = h.palmPosition();
                        float x = defaultPosition.getX() - handPosition.getX();
                        float y = defaultPosition.getY() - handPosition.getY();
                        double distance = Math.sqrt(x * x + y * y);
                        if(distance > MINIMUM_DISTANCE || h.id() == this.mainHandId) {
                            res.add(h);
                        }
                    }
                }
                return res;
        }
    }

    private boolean canChangeCommand(long time) {
        return time - this.lasCommand > MIN_DELAY;
    }
}
