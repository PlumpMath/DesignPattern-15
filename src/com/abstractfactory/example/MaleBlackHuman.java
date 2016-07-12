package com.abstractfactory.example;

/**
 * Created by toryang on 7/11/16.
 */
public class MaleBlackHuman extends AbstractBlackHuman {
    @Override
    public void getSex() {
        System.out.println("黑人男性");
    }
}
