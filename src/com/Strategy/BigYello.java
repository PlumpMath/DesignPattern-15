package com.Strategy;

import com.Strategy.impl.FlyingNoWay;
import com.Strategy.quack.QuackGaGa;

/**
 * Created by Toryang on 2015/4/20.
 */
public class BigYello extends Duck {
    public BigYello(){
        super();
        super.setFlyingStrategy(new FlyingNoWay());
        super.setQuackStrategy(new QuackGaGa());
    }

    @Override
    public void Display() {
        System.out.println("i am big and yello");
    }
}
