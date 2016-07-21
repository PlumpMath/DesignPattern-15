package com.adapter;

/**
 * Created by toryang on 7/18/16.
 */
public class Client  {
    public static void main(String[] args) {
        Target target = new ConcreteTarget();

        target.request();

        Target target1 = new Adapter();

        target.request();
    }
}
