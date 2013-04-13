/*
 * Make the robot move its head
 */

import com.aldebaran.proxy.*;

public class MoveHead {
	private static String NAOQI_IP = "nao.local";
	private static int NAOQI_PORT = 9559;

	// This is required so that we can use the 'Variant' object
	static {
	System.loadLibrary("jnaoqi");
	}

	public static void main(String[] args) {
		ALMotionProxy motion = new ALMotionProxy(NAOQI_IP, NAOQI_PORT);
		// This lets you use bound methods that excpects ALValue from Java:
		Variant names  = new Variant(new String[] {"HeadYaw" });
		Variant angles = new Variant(new float[] { -0.5f, 0.5f, 0.0f });
		Variant times  = new Variant(new float[] {	1.0f, 2.0f, 3.0f });

		motion.setStiffnesses(new Variant(new String[] {"HeadYaw"}), new Variant(new float[] {1.0f}));
		motion.angleInterpolation(names, angles, times, true);
		motion.setStiffnesses(new Variant(new String[] {"HeadYaw"}), new Variant(new float[] {0.0f}));
	}
}
