package com.sfeir.devoxx.leap;

import com.sfeir.devoxx.common.Command;

/**
 * Main interface for the leap control.
 * This makes the leap in a passive mode, users of this interface will control the frequency of commands.
 *
 * Date: 02/03/13
 *
 * @author François LAROCHE
 */
public interface LeapController {

    /**
     * Retrieves the current command asked by the user, or {@code null} if nothing is happening
     *
     * @return the current {@link com.sfeir.devoxx.common.Command} or {@code null}
     * @see Command#MOVE_BACKWARDS
     * @see Command#MOVE_FORWARD
     * @see Command#TURN_LEFT
     * @see Command#TURN_RIGHT
     * @see Command#STAND_UP
     * @see Command#SIT_DOWN
     */
    Command getCurrentCommand();

    void addCommandListener(CommandListener listener);
}
