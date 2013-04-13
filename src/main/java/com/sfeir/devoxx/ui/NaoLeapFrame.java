package com.sfeir.devoxx.ui;

import com.sfeir.devoxx.coordination.Coordinator;
import com.sfeir.devoxx.leap.LeapControllerFactory;
import com.sfeir.devoxx.leap.impl.DefaultLeapControllerFactory;
import com.sfeir.devoxx.nao.NaoController;
import com.sfeir.devoxx.nao.NaoControllerFactory;
import com.sfeir.devoxx.nao.impl.DefaultNaoControllerFactory;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/**
 * Date: 07/03/13
 *
 * @author François LAROCHE
 */
public class NaoLeapFrame extends JFrame implements ActionListener {

    private final Executor executor;

    private final NaoContainer naoContainer;

    public NaoLeapFrame() throws HeadlessException {
        this.setTitle("Nao and Lep are fun !!");
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.naoContainer = new NaoContainer();
        this.getContentPane().add(this.naoContainer);
        this.executor = Executors.newSingleThreadExecutor();
        this.naoContainer.addActionListener(this);
        this.setBounds(0, 0, 500, 500);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        new NaoLeapFrame();
    }

    @Override
    public void actionPerformed(final ActionEvent e) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                ((JButton) e.getSource()).setEnabled(false);
            }
        });

        LeapControllerFactory leapControllerFactory = new DefaultLeapControllerFactory();
        NaoControllerFactory naoControllerFactory = new DefaultNaoControllerFactory(
                this.naoContainer.getIp(), this.naoContainer.getPort());
        Coordinator c = new Coordinator(leapControllerFactory, naoControllerFactory);
        this.executor.execute(c);
    }
}
