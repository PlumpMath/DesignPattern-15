package com.Singleton;

/**
 * Created by Toryang on 2015/4/18.
 * 单例模式
 * 应用场合：只需要一个就够了
 * 作用：保证某个实例中有且只有一个
 * 类型：懒汉模式，饿汉模式
 */

//4月19日培训
public class Singleton {
    //1、将构造方法私有化，不允许外界直接创建对象
    private Singleton(){
    }

    //2、创建类的唯一实例,使用private static
    private static Singleton instance = new Singleton();

    //3、提供一个获取实例的方法，使用public static
    public static Singleton getInstance(){
        return  instance;
    }
}
