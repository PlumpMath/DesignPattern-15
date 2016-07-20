package com.strategy.example;

import com.strategy.example.IStrategy;

/**
 * Created by toryang on 7/15/16.
 */
public class BackDoor implements IStrategy {

    @Override
    public void operate() {
        System.out.println("找乔国老开后门");
    }
}
