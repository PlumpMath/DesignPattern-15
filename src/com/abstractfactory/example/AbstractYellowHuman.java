package com.abstractfactory.example;

/**
 * Created by toryang on 7/11/16.
 */
public abstract class AbstractYellowHuman implements Human  {

    @Override
    public void getColor() {
        System.out.println("黄色人种,黄色皮肤");
    }

    @Override
    public void talk() {
        System.out.println("黄色人种,说话双字节");
    }
}
