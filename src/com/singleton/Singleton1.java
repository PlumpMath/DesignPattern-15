package com.singleton;

/**
 * Created by toryang on 7/11/16.
 *
 * 单例模式通用代码:饿汉式
 */
public class Singleton1 {

    private static final Singleton1 singleton = new Singleton1();
    private Singleton1(){

    }

    public static Singleton1 getSingleton() {
        return singleton;
    }

    public static void doSomething(){

    }
}
