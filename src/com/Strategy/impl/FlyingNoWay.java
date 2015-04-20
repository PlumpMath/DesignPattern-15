package com.Strategy.impl;

import com.Strategy.FlyingStrategy;

/**
 * Created by Toryang on 2015/4/20.
 */
public class FlyingNoWay implements FlyingStrategy {
    @Override
    public void performFly() {
        System.out.println("i could not fly");
    }
}
