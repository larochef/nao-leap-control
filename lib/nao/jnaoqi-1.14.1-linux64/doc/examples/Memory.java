/*
 * Small example to get and set variables from ALMemory
 */

import com.aldebaran.proxy.*;

public class Memory {
	static {
		System.loadLibrary("jnaoqi");
	}

	private static String NAOQI_IP = "nao.local";
	private static int NAOQI_PORT = 9559;

	public static void main(String[] args) {
		ALMemoryProxy memory = new ALMemoryProxy(NAOQI_IP, NAOQI_PORT);
		memory.insertData("answer", 42);
		Variant res = memory.getData("answer");
		System.out.format("The answer is %d\n", res.toInt());
	}
}

