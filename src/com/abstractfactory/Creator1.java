package com.abstractfactory;

/**
 * Created by toryang on 7/11/16.
 */
public class Creator1 extends AbstractCreator {

    @Override
    public AbstractProductA createProductA() {
        return new Product1();
    }
}
