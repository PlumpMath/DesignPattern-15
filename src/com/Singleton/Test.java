package com.Singleton;

/**
 * Created by Toryang on 2015/4/18.
 */
public class Test {
    public static void main(String[] args){
        //饿汉模式
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        if(s1 == s2){
            System.out.println("s1 and s2 is the same instance");
        }
        else{
            System.out.println("s1 and s2 is not the same instance");
        }

        //懒汉模式
        Singleton02 s3 = Singleton02.getInstance();
        Singleton02 s4 = Singleton02.getInstance();
        if(s3 == s4){
            System.out.println("s3 and s4 is the same instance");
        }
        else{
            System.out.println("s3 and s4 is not the same instance");
        }
    }
}
