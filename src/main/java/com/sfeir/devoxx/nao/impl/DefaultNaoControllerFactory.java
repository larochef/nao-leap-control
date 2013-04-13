package com.sfeir.devoxx.nao.impl;

import com.sfeir.devoxx.nao.NaoController;
import com.sfeir.devoxx.nao.NaoControllerFactory;

public class DefaultNaoControllerFactory implements NaoControllerFactory{

    private final String ip;
    private final int port;

    public DefaultNaoControllerFactory(String ip, int port) {
        this.ip = ip;
        this.port = port;
    }

    public DefaultNaoControllerFactory() {
        this.ip = NaoControllerImpl.NAO_IP;
        this.port = NaoControllerImpl.NAO_PORT;
    }

    @Override
	public NaoController build() {
        NaoControllerImpl controller = new NaoControllerImpl(this.ip, this.port);
		controller.setDebug(true);
        return controller;
	}

}
