package com.Strategy.quack;

import com.Strategy.QuackStrategy;

/**
 * Created by Toryang on 2015/4/20.
 */
public class QuackGaGa implements QuackStrategy {
    @Override
    public void performQuack() {
        System.out.println("gaga~~~~~");
    }
}
