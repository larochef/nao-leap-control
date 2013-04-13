package com.sfeir.devoxx.coordination;

import com.leapmotion.leap.Vector;
import com.sfeir.devoxx.common.Command;
import com.sfeir.devoxx.leap.CommandListener;
import com.sfeir.devoxx.leap.LeapController;
import com.sfeir.devoxx.leap.LeapControllerFactory;
import com.sfeir.devoxx.nao.NaoController;
import com.sfeir.devoxx.nao.NaoControllerFactory;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/**
 * Date: 06/03/13
 *
 * @author François LAROCHE
 */
public class Coordinator implements CommandListener, Runnable {

    private final Set<Command> commands;

    // Keep instance of these to avoid collection
    private LeapControllerFactory leapControllerFactory;
    private NaoControllerFactory naoControllerFactory;
    private NaoController naoController;
    private boolean loop = false;

    public Coordinator(LeapControllerFactory leapFactory, NaoControllerFactory naoFactory) {
        this.commands = new TreeSet<Command>();
        this.naoControllerFactory = naoFactory;
        this.leapControllerFactory = leapFactory;
    }

    public void stopLoop() {
        this.loop = false;
    }

    public void run() {
        this.loop = true;
        LeapController leapController = this.leapControllerFactory.build();
        leapController.addCommandListener(this);
        this.naoController = this.naoControllerFactory.build();

        // Init Nao when beginning the process
        this.naoController.executeCommand(Command.INIT);

        while(this.loop) {
            if(!this.commands.isEmpty()) {
                Command c = null;
                synchronized (this.commands) {
                    Iterator<Command> iterator = this.commands.iterator();
                    c = iterator.next();
                    iterator.remove();
                    if(c == Command.RELAX && !this.commands.isEmpty()) {
                        c = null;
                    }
                }
                if(c != null) {
                    this.naoController.executeCommand(c);
                }
            }
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                break;
            }
        }
        leapController.getCurrentCommand();
    }

    @Override
    public void onCommandChange(Command command) {
        if(command != null && this.commands.size() < 2) {
            this.commands.add(command);
        }
    }

    @Override
    public void onNewOrigin(Vector origin) {
        System.out.println("New Origin");
    }

    @Override
    public void onResetOrigin() {
        this.naoController.executeCommand(Command.RELAX);
    }
}
