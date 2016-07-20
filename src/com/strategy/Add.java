package com.strategy;

/**
 * Created by toryang on 7/15/16.
 */
public class Add implements Calculator {
    @Override
    public int exec(int a, int b) {
        return a+b;
    }
}
