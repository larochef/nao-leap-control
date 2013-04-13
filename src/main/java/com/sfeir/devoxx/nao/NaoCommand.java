package com.sfeir.devoxx.nao;

import java.awt.Color;

public enum NaoCommand {

	// private Color VIOLLET = new Color(150, 0, 200);
	// private Color ORANGE = new Color(255, 45, 0);
	// private Color PINK = new Color(255, 10, 255);
	NAO_MOVE_FORWARD(Color.GREEN, "j'avance", "je ne suis pas debout"), NAO_MOVE_BACKWARDS(
			Color.RED, "je recule", "je ne suis pas debout"), NAO_TURN_LEFT(
			Color.BLUE, "je tourne à gauche", "je ne suis pas debout"), NAO_TURN_RIGHT(
			new Color(255, 45, 0), "je tourne à droite",
			"je ne suis pas debout"), NAO_STAND_UP(Color.YELLOW, "je me lève",
			"je suis déjà debout"), NAO_SIT_DOWN(new Color(255, 10, 255), "je m'assied",
			"je suis déjà assis"), NAO_INIT(Color.WHITE,
			"Bonjour, je suis Nao", null), NAO_RELAX(new Color(50, 50, 50),
			"je me repose", null), NAO_OPEN_HANDS(new Color(150,
			0, 200), "j'ouvre mes mains", null), NAO_CLOSE_HANDS(new Color(150,
			0, 200), "je ferme mes mains", null), NAO_BLINK(Color.WHITE,
			"Regarde mes yeux", null);

	private Color color;

	private String message;

	private String messageError;

	private NaoCommand(Color color, String message, String messageError) {
		this.color = color;
		this.message = message;
		this.messageError = messageError;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getMessageError() {
		return messageError;
	}

	public void setMessageError(String messageError) {
		this.messageError = messageError;
	}

}
