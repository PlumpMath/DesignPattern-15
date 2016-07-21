package com.adapter;

/**
 * Created by toryang on 7/18/16.
 */
public class Adapter extends Adaptee implements Target {
    @Override
    public void request() {
        super.doSomething();
    }
}
