package com.abstractfactory.example;

/**
 * Created by toryang on 7/11/16.
 */
public class FemaleBlackHuman extends AbstractBlackHuman {

    @Override
    public void getSex() {
        System.out.println("黑人女性");
    }
}
