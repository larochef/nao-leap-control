package com.sfeir.devoxx.ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

/**
 * Date: 07/03/13
 *
 * @author François LAROCHE
 */
public class NaoContainer extends JComponent {

    private final JTextField ip;
    private final JTextField port;
    private final JButton action;

    public NaoContainer() {
        this.ip = new JTextField("192.168.0.1", 10);
        this.port = new JTextField("9559", 10);
        this.action = new JButton("Commencer !");

        initContent();
        setBorder(BorderFactory.createTitledBorder("Nao, technology from now"));
    }

    private void initContent() {
        this.setLayout(new GridBagLayout());
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.insets = new Insets(2, 2, 2, 2);
        constraints.anchor = GridBagConstraints.CENTER;
        constraints.fill = GridBagConstraints.NONE;
        constraints.gridheight = 1;
        constraints.gridwidth = 1;
        constraints.gridwidth = GridBagConstraints.REMAINDER;
        this.add(new JLabel("Configuration de Nao"), constraints);
        constraints.gridwidth = GridBagConstraints.RELATIVE;
        this.add(new JLabel("Adresse IP"), constraints);
        constraints.gridwidth = GridBagConstraints.REMAINDER;
        this.add(this.ip, constraints);
        constraints.gridwidth = GridBagConstraints.RELATIVE;
        this.add(new JLabel("Port"), constraints);
        constraints.gridwidth = GridBagConstraints.REMAINDER;
        this.add(this.port, constraints);
        this.add(this.action, constraints);
    }

    public void addActionListener(ActionListener l) {
        action.addActionListener(l);
    }

    public String getIp() {
        return this.ip.getText();
    }

    public int getPort() {
        return Integer.parseInt(this.port.getText());
    }
}
