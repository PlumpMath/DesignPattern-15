package com.singleton;

/**
 * Created by toryang on 7/11/16.
 * 单例模式通用代码:懒汉式
 *
 * 考虑到线程安全,需要添加synchronized关键字保持线程安全
 *
 */
public class Singleton2 {
    private static Singleton2 singleton2 = null;

    private Singleton2(){

    }

    public static synchronized Singleton2 getSingleton2() {
        if (singleton2 == null){
            singleton2 = new Singleton2();
        }
        return singleton2;
    }
    public static void doSomething(){

    }
}
