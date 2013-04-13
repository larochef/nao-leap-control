package com.sfeir.devoxx.leap;

import com.leapmotion.leap.Vector;
import com.sfeir.devoxx.common.Command;

/**
 * Date: 04/03/13
 *
 * @author François LAROCHE
 */
public interface CommandListener {

    void onCommandChange(Command command);

    void onNewOrigin(Vector origin);

    void onResetOrigin();

}
