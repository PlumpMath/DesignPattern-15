package com.strategy.example;

/**
 * Created by toryang on 7/15/16.
 */
public class GivenGreenLight implements IStrategy {
    @Override
    public void operate() {
        System.out.println("吴国太开绿灯");
    }
}
