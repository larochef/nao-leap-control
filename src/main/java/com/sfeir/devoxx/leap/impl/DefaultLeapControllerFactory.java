package com.sfeir.devoxx.leap.impl;

import com.sfeir.devoxx.leap.LeapController;
import com.sfeir.devoxx.leap.LeapControllerFactory;

/**
 * Date: 05/03/13
 *
 * @author François LAROCHE
 */
public class DefaultLeapControllerFactory implements LeapControllerFactory {
    @Override
    public LeapController build() {
        return new LeapControllerImpl();
    }
}
