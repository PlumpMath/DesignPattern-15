package com.observer;

/**
 * Created by toryang on 7/21/16.
 */
public class ConcreteObserver implements Observer {
    @Override
    public void update() {
        System.out.println("receive message");
    }
}
