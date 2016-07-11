package com.factorymethod.example;

/**
 * Created by toryang on 7/11/16.
 */
public class BlackHuman implements Human {
    @Override
    public void getColor() {
        System.out.println("黑人黑色皮肤");
    }

    @Override
    public void talk() {
        System.out.println("我是黑人");
    }
}
