package com.sfeir.devoxx.leap;

import com.leapmotion.leap.Vector;
import com.sfeir.devoxx.common.Command;
import com.sfeir.devoxx.leap.impl.LeapControllerImpl;

import java.io.IOException;

/**
 * Date: 04/03/13
 *
 * @author François LAROCHE
 */
public class LeapMain {
    public static void main(String[] args) throws IOException {
        CommandListener listener = new CommandListener() {
            @Override
            public void onResetOrigin() {
                System.out.println("Origin has been nullified");
            }

            @Override
            public void onCommandChange(Command command) {
                System.out.println("Changing command to : " + command);
            }

            @Override
            public void onNewOrigin(Vector origin) {
                System.out.println("Setting new origin to : " + origin);
            }
        };
        LeapController controller = new LeapControllerImpl();
        controller.addCommandListener(listener);
        System.in.read();
    }
}
