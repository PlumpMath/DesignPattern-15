package com.Strategy;

import com.Strategy.impl.FlyingNoWay;
import com.Strategy.quack.QuackGaGa;

/**
 * Created by Toryang on 2015/4/20.
 */
public class RubberDuck extends Duck {
    public RubberDuck(){
        super();
        super.setFlyingStrategy(new FlyingNoWay());
        super.setQuackStrategy(new QuackGaGa());
    }
    @Override
    public void Display() {
        System.out.println("i am yello, my mouth is red");
    }


}
