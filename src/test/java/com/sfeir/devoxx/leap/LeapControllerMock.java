package com.sfeir.devoxx.leap;

import com.sfeir.devoxx.common.Command;

import java.util.Collection;
import java.util.Iterator;

/**
 *
 *
 * Date: 05/03/13
 *
 * @author François LAROCHE
 */
public class LeapControllerMock implements LeapController {

    private Iterator<Command> current;

    public LeapControllerMock(Collection<Command> commands) {
        this.commands = commands;
        this.current = this.commands.iterator();
    }

    private final Collection<Command> commands;

    @Override
    public Command getCurrentCommand() {
        if(this.commands.isEmpty()) {
            return null;
        }
        if(!this.current.hasNext()) {
            this.current = this.commands.iterator();
        }
        return this.current.next();
    }

    @Override
    public void addCommandListener(CommandListener listener) {
        // Do nothing, mock doesn't implement that
    }
}
