package com.sfeir.devoxx.common;

/**
 * Date: 02/03/13
 *
 * @author François LAROCHE
 */
public enum Command {
    /**
     * Asks Nao to walk forward of a few steps
     */
    MOVE_FORWARD,
    /**
     * Asks Nao to walk backwards of a few steps
     */
    MOVE_BACKWARDS,
    /**
     * Asks Nao to turn left of a few degrees. He might also make a few steps to achieve it
     */
    TURN_LEFT,
    /**
     * Asks Nao to turn right of a few degrees. He might also make a few steps to achieve it
     */
    TURN_RIGHT,
    /**
     * Asks Nao to stand up. If Nao if already standing, this should have no effect
     */
    STAND_UP,
    /**
     * Asks Nao to sit down. If Nao if already sitting, this should have no effect
     */
    SIT_DOWN,
    /**
     * Asks Nao to init. Nao sit and wait.
     */
    INIT,
    /**
     * Asks Nao to relax and remove stiffness. 
     */
    RELAX,
    /**
     * Asks Nao to open both hands. call a behavior on the robot.
     */
    OPEN_HANDS,
    /***
     * Asks Nao to close both hands. call a behavior on the robot.
     */
    CLOSE_HANDS,
    /**
     * Blink eyes
     */
    BLINK

}
