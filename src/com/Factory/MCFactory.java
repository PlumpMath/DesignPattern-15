package com.Factory;

/**
 * Christmas Factory;
 * Created by Toryang on 2015/4/18.
 */
public class MCFactory implements PersonFactory {
    @Override
    public Boy getBoy() {
        return new MCBoy();
    }

    @Override
    public Girl getGirl() {
        return new MCGirl();
    }
}
