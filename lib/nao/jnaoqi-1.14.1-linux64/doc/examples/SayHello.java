/*
 * Make the robot say "Hello, World"
 */

import com.aldebaran.proxy.*;

public class SayHello {
	private static String NAOQI_IP = "nao.local";
	private static int NAOQI_PORT = 9559;

	public static void main(String[] args) {
		ALTextToSpeechProxy tts = new ALTextToSpeechProxy(NAOQI_IP, NAOQI_PORT);
		tts.say("Hello, world");
	}
}

