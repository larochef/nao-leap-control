package com.sfeir.devoxx;

import com.sfeir.devoxx.coordination.Coordinator;
import com.sfeir.devoxx.leap.LeapControllerFactory;
import com.sfeir.devoxx.leap.impl.DefaultLeapControllerFactory;
import com.sfeir.devoxx.nao.NaoControllerFactory;
import com.sfeir.devoxx.nao.impl.DefaultNaoControllerFactory;

import java.io.IOException;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Date: 09/03/13
 *
 * @author François LAROCHE
 */
public class TesAll {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        NaoControllerFactory naoFactory = new DefaultNaoControllerFactory("192.168.0.1", 9559);
        LeapControllerFactory leapFactory = new DefaultLeapControllerFactory();
        Coordinator c = new Coordinator(leapFactory, naoFactory);
        System.out.println("Launching process...");
        ExecutorService executor = Executors.newSingleThreadScheduledExecutor();
        executor.execute(c);
        try {
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
