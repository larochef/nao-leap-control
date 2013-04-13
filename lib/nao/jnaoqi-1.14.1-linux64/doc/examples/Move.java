/*
 * Make the robot wake up, move forward and then rest
 *
 * To run the example, make sure the robot is in proper position first.
 */

import com.aldebaran.proxy.*;

public class Move {
	private static String NAOQI_IP = "nao.local";
	private static int NAOQI_PORT = 9559;

	public static void main(String[] args) {
		ALMotionProxy motion = new ALMotionProxy(NAOQI_IP, NAOQI_PORT);
		motion.wakeUp();
		motion.moveInit();
		motion.moveTo(0.3f, 0.0f, 0.0f);
		motion.rest();
	}
}
