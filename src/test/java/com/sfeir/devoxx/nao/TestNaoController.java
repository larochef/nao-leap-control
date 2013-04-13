package com.sfeir.devoxx.nao;

import com.sfeir.devoxx.common.Command;
import com.sfeir.devoxx.nao.impl.DefaultNaoControllerFactory;
import com.sfeir.devoxx.nao.impl.NaoControllerImpl;

import java.awt.Color;
import java.util.Locale;

public class TestNaoController {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		NaoControllerImpl naoController = (NaoControllerImpl) new DefaultNaoControllerFactory(
				"169.254.89.225", 9559).build();
		// naoController.runBehavior("dyslexie");
		naoController.setDebug(false);
//		naoController.executeCommand(Command.INIT);
//		naoController.executeCommand(Command.SIT_DOWN);
		// naoController.executeCommand(Command.OPEN_HANDS);
		// naoController.executeCommand(Command.CLOSE_HANDS);
		// naoController.executeCommand(Command.MOVE_FORWARD);
//		naoController.executeCommand(Command.STAND_UP);
		// naoController.executeCommand(Command.RELAX);
		// naoController.executeCommand(Command.OPEN_HANDS);
		// naoController.executeCommand(Command.CLOSE_HANDS);
		// naoController.executeCommand(Command.SIT_DOWN);
		// naoController.executeCommand(Command.STAND_UP);
		// naoController.executeCommand(Command.MOVE_FORWARD);
//		naoController.executeCommand(Command.TURN_LEFT);
		// naoController.executeCommand(Command.SIT_DOWN);
		// naoController.executeCommand(Command.RELAX);
		// naoController.executeCommand(Command.TURN_LEFT);
		// naoController.executeCommand(Command.TURN_LEFT);
		// naoController.executeCommand(Command.TURN_LEFT);
//		naoController.executeCommand(Command.TURN_RIGHT);
		// naoController.executeCommand(Command.MOVE_BACKWARDS);
		// naoController.executeCommand(Command.MOVE_FORWARD);
		// naoController.executeCommand(Command.TURN_RIGHT);
		// naoController.executeCommand(Command.MOVE_FORWARD);
		// naoController.executeCommand(Command.TURN_RIGHT);
		// naoController.executeCommand(Command.MOVE_FORWARD);
//		naoController.executeCommand(Command.RELAX);
		 naoController.executeCommand(Command.SIT_DOWN);
		 naoController.executeCommand(Command.RELAX);
	}

}
