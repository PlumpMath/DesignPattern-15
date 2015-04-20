package com.Strategy.impl;

import com.Strategy.FlyingStrategy;

/**
 * Created by Toryang on 2015/4/20.
 */
public class FlyWithRocket implements FlyingStrategy {

    @Override
    public void performFly() {
        System.out.println("fly with rocket");
    }
}
