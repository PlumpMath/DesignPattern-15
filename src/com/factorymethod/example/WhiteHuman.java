package com.factorymethod.example;

/**
 * Created by toryang on 7/11/16.
 */
public class WhiteHuman implements Human {
    @Override
    public void getColor() {
        System.out.println("白色人种,白色皮肤");
    }

    @Override
    public void talk() {
        System.out.println("白人说话单字节");
    }
}
