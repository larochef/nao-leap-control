package com.sfeir.devoxx.nao.impl;

import java.awt.Color;

import com.aldebaran.proxy.ALBehaviorManagerProxy;
import com.aldebaran.proxy.ALLedsProxy;
import com.aldebaran.proxy.ALMotionProxy;
import com.aldebaran.proxy.ALRobotPostureProxy;
import com.aldebaran.proxy.ALTextToSpeechProxy;
import com.aldebaran.proxy.Variant;
import com.sfeir.devoxx.common.Command;
import com.sfeir.devoxx.nao.NaoCommand;
import com.sfeir.devoxx.nao.NaoController;

public class NaoControllerImpl implements NaoController {

	static final String NAO_IP = "169.254.89.225";
	static final int NAO_PORT = 9559;
	// isDebug : if true Nao speak else Nao is mute.
	private boolean isDebug;

	// vitesse relative.
	private static final float speed = 1f;
	// angle de rotation
	private static final float rad = (float) (Math.PI / 4f);
	// distance en métre
	private static final float distance = 0.1f;
	// son 0 to 1
	private static final float volume = 1.0f;

	private final ALTextToSpeechProxy tts;
	private final ALMotionProxy motion;
	private final ALRobotPostureProxy posture;
	private final ALBehaviorManagerProxy behavior;
	private final ALLedsProxy leds;

	public NaoControllerImpl() {
		this(NAO_IP, NAO_PORT);
	}
	
	
	@Override
	public void setDebug(boolean isDebug) {
		this.isDebug = isDebug;
	}

    public NaoControllerImpl(String ip, int port) {
		this.tts = new ALTextToSpeechProxy(ip, port);
		this.motion = new ALMotionProxy(ip, port);
		this.posture = new ALRobotPostureProxy(ip, port);
		this.behavior = new ALBehaviorManagerProxy(ip, port);
		this.leds = new ALLedsProxy(ip, port);

		tts.setVolume(volume);
		// config francais !
		tts.setLanguage("French");
	}

	@Override
	public synchronized void executeCommand(Command command) {
		switch (command) {
		case MOVE_FORWARD:
			if (isStanding()) {
				executeCommand(NaoCommand.NAO_MOVE_FORWARD);
			} else {
				sayTextError(NaoCommand.NAO_MOVE_FORWARD);
			}
			break;
		case MOVE_BACKWARDS:
			if (isStanding()) {
				executeCommand(NaoCommand.NAO_MOVE_BACKWARDS);
			} else {
				sayTextError(NaoCommand.NAO_MOVE_BACKWARDS);
			}
			break;
		case TURN_LEFT:
			if (isStanding()) {
				executeCommand(NaoCommand.NAO_TURN_LEFT);
			} else {
				sayTextError(NaoCommand.NAO_TURN_LEFT);
			}
			break;
		case TURN_RIGHT:
			if (isStanding()) {
				executeCommand(NaoCommand.NAO_TURN_RIGHT);
			} else {
				sayTextError(NaoCommand.NAO_TURN_RIGHT);
			}
			break;
		case STAND_UP:
			if (!isStanding()) {
				executeCommand(NaoCommand.NAO_STAND_UP);
			} else {
				sayTextError(NaoCommand.NAO_STAND_UP);
			}
			break;
		case SIT_DOWN:
			if (!isSitting()) {
				executeCommand(NaoCommand.NAO_SIT_DOWN);
			} else {
				sayTextError(NaoCommand.NAO_SIT_DOWN);
			}
			break;
		case OPEN_HANDS:
			executeCommand(NaoCommand.NAO_OPEN_HANDS);
			break;
		case CLOSE_HANDS:
			executeCommand(NaoCommand.NAO_CLOSE_HANDS);
			break;
		case BLINK:
			executeCommand(NaoCommand.NAO_BLINK);
			break;
		case INIT:
			executeCommand(NaoCommand.NAO_INIT);
			break;
		case RELAX:
			if (isSitting() && motion.getStiffnesses(new Variant("Body"))[0] > 0f) {
				executeCommand(NaoCommand.NAO_RELAX);
			} else {
				sayTextError(NaoCommand.NAO_RELAX);
			}
			break;
		default:
			//sayText("Pas de commande");
			break;
		}
		//sayText("Fin de la commande");
	}

	private void executeCommand(NaoCommand command) {
		motion.wakeUp();
		setEyesColor(command.getColor());
		sayText(command.getMessage());
		switch (command) {
		case NAO_MOVE_FORWARD:
			motion.moveTo(distance, 0.0f, 0.0f);
			break;
		case NAO_MOVE_BACKWARDS:
			motion.moveTo(-distance, 0.0f, 0.0f);
			break;
		case NAO_TURN_LEFT:
			motion.moveTo(0.0f, 0.0f, rad);
			break;
		case NAO_TURN_RIGHT:
			motion.moveTo(0.0f, 0.0f, -rad);
			break;
		case NAO_STAND_UP:
			posture.goToPosture("Stand", speed);
			break;
		case NAO_SIT_DOWN:
			posture.goToPosture("Sit", speed);
			break;
		case NAO_OPEN_HANDS:
			runBehavior("OpenHands");
			break;
		case NAO_CLOSE_HANDS:
			runBehavior("CloseHands");
			break;
		case NAO_BLINK:
			for (int i = 0; i < 3; i++) {
				setEyesColor(Color.YELLOW);
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// silent
				}
				setEyesColor(Color.BLUE);
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// silent
				}
				setEyesColor(new Color(255, 10, 255));
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// silent
				}
			}
			setEyesColor(Color.WHITE);
			break;
		case NAO_INIT:
			posture.goToPosture("SitRelax", speed);
			break;
		case NAO_RELAX:
			posture.goToPosture("SitRelax", speed);
			motion.rest();
			break;
		default:
			sayText("Nao ne connait pas cette commande");
			break;
		}
		if (!NaoCommand.NAO_RELAX.equals(command)) {
			setEyesColor(Color.WHITE);
		}
	}

	public void runBehavior(String behaviorName) {
		if (behavior.isBehaviorInstalled(behaviorName)) {
			behavior.runBehavior(behaviorName);
		}
	}

	private boolean isStanding() {
        return "Standing".equals(posture.getPostureFamily());
	}

	private boolean isSitting() {
		return  "Sitting".equals(posture.getPostureFamily());
	}

	private void sayText(String text) {
		if (isDebug && text != null && !text.isEmpty()) {
			tts.say(text);
		}
	}

	private void sayTextError(NaoCommand command) {
		if (isDebug) {
			String text = command.getMessageError();
			if (text != null && !text.isEmpty()) {
				tts.say(text);
			}
		}
	}

	public void setEyesColor(Color color) {
		float red = color.getRed() == 0f ? 0f : (color.getRed() / 255f);
		leds.setIntensity("RightFaceLedsRed", red);
		leds.setIntensity("LeftFaceLedsRed", red);
		float green = color.getGreen() == 0f ? 0f : (color.getGreen() / 255f);
		leds.setIntensity("RightFaceLedsGreen", green);
		leds.setIntensity("LeftFaceLedsGreen", green);
		float blue = color.getBlue() == 0f ? 0f : (color.getBlue() / 255f);
		leds.setIntensity("RightFaceLedsBlue", blue);
		leds.setIntensity("LeftFaceLedsBlue", blue);
	}

}
