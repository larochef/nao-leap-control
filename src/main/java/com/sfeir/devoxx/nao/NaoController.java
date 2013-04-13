package com.sfeir.devoxx.nao;

import com.sfeir.devoxx.common.Command;

/**
 * Interface used to control NAO.
 * Implementors are required to have all these methods <b>blocking</b>
 *
 * Date: 02/03/13
 *
 * @author François LAROCHE
 */
public interface NaoController {

    /**
     * Executes a command.
     *
     * @param command the {@link com.sfeir.devoxx.common.Command} to execute
     * @see Command#MOVE_BACKWARDS
     * @see Command#MOVE_FORWARD
     * @see Command#TURN_LEFT
     * @see Command#TURN_RIGHT
     * @see Command#STAND_UP
     * @see Command#SIT_DOWN
     * @see Command#INIT
     * @see Command#RELAX
     */
    void executeCommand(Command command);
    
    void setDebug(boolean isDebug);

}
