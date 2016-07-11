package com.factorymethod;

/**
 * Created by toryang on 7/11/16.
 */
public abstract class Creator {

    public abstract <T extends Product> T createProduct(Class<T> c);
}
