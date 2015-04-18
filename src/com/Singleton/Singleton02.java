package com.Singleton;

/**
 * Created by Toryang on 2015/4/18.
 * 懒汉模式
 * 区别：
 * 懒汉模式：加载类的速度较快，但是运行时获取对象的速度较慢，线程不安全
 * 饿汉模式：加载类的速度较慢，但是运行时获取对象的速度较快，线程安全
 */
public class Singleton02 {
    //1、将构造方法私有化，不允许外界直接创建对象
    private Singleton02(){

    }
    //2、声明类的唯一实例,使用private static
    private static Singleton02 instance ;

    //3、提供一个获取实例的方法，使用public static
    public static Singleton02 getInstance(){
        if (instance == null){
            instance = new Singleton02();
        }

        return instance;
    }
}
