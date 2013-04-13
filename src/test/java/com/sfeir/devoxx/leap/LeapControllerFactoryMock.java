package com.sfeir.devoxx.leap;

import com.sfeir.devoxx.common.Command;

import java.util.Collection;

/**
 * Date: 05/03/13
 *
 * @author François LAROCHE
 */
public class LeapControllerFactoryMock implements LeapControllerFactory {

    private final Collection<Command> commands;

    public LeapControllerFactoryMock(Collection<Command> commands) {
        this.commands = commands;
    }

    @Override
    public LeapController build() {
        return new LeapControllerMock(this.commands);
    }
}
