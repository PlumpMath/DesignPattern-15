package com.strategy.example;

/**
 * Created by toryang on 7/15/16.
 */
public class Context {
    IStrategy iStrategy;

    public Context(IStrategy iStrategy) {
        this.iStrategy = iStrategy;
    }

    public void operate(){
        this.iStrategy.operate();
    }

}
