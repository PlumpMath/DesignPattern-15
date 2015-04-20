package com.Strategy;

import com.Strategy.impl.FlyWithWing;
import com.Strategy.quack.QuackGuaGua;

/**
 * Created by Toryang on 2015/4/20.
 */
public class RedheadDuck extends Duck {
    public RedheadDuck(){
        super();
        super.setFlyingStrategy(new FlyWithWing());
        super.setQuackStrategy(new QuackGuaGua());
    }

    @Override
    public void Display() {
        System.out.println("my head is red");
    }
}
