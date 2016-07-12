package com.abstractfactory.example;

/**
 * Created by toryang on 7/11/16.
 */
public class MaleYellowHuman extends AbstractYellowHuman {
    @Override
    public void getSex() {
        System.out.println("黄人男性");
    }
}
