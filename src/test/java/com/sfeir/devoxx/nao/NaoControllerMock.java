package com.sfeir.devoxx.nao;

import com.sfeir.devoxx.common.Command;

import java.util.Random;

/**
 * Date: 05/03/13
 *
 * @author François LAROCHE
 */
public class NaoControllerMock implements NaoController {

    private static final int MAX_WAIT_TIME = 20000; // 20 seconds
    private static final Random RANDOM = new Random(15874622121213487l);

    @Override
    public void executeCommand(Command command) {
        // Mock will only wait for some random time
        try {
            Thread.sleep(RANDOM.nextInt(MAX_WAIT_TIME));
        } catch (InterruptedException e) {
            // No idea of what we could do there anyway if we were interrupted...
        }
    }

	@Override
	public void setDebug(boolean isDebug) {
		// TODO Auto-generated method stub
		
	}
}
