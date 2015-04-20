package com.Strategy;

import com.Strategy.impl.FlyWithWing;

/**
 * Created by Toryang on 2015/4/20.
 */
public class MallardDuck extends Duck {

    public MallardDuck(){
        super();
        super.setFlyingStrategy(new FlyWithWing());
    }

    @Override
    public void Display() {
        System.out.println("my neck is green");
    }
}
