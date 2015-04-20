package com.Strategy;

import com.Strategy.impl.FlyWithRocket;
import com.Strategy.quack.QuackGuaGua;

/**
 * Created by Toryang on 2015/4/20.
 */
public class SpaceDuck extends Duck {

    public SpaceDuck(){
        super();
        super.setFlyingStrategy(new FlyWithRocket());
        super.setQuackStrategy(new QuackGuaGua());
    }
    @Override
    public void Display() {
        System.out.println("spacecloth");
    }


}
