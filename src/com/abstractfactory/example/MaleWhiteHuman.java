package com.abstractfactory.example;

/**
 * Created by toryang on 7/11/16.
 */
public class MaleWhiteHuman extends AbstractWhiteHuman{
    @Override
    public void getSex() {
        System.out.println("白人男性");
    }
}
