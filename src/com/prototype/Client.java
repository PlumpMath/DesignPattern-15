package com.prototype;

import com.sun.xml.internal.ws.server.sei.TieHandler;

/**
 * Created by toryang on 7/13/16.
 */
public class Client {
    public static void main(String[] args) {


        Thing thing = new Thing();
        Thing cloneThing = thing.clone();

        // 浅拷贝测试
        Thing1 thing1 = new Thing1();
        thing1.setArrayList("Tom");
        Thing1 cloneThing1 = thing1.clone();
        cloneThing1.setArrayList("Jerry");
        System.out.println(thing1.getArrayList());

        // 深拷贝测试
        Thing2 thing2 = new Thing2();
        thing2.setArrayList("Tom");
        Thing2 cloneThing2 = thing2.clone();
        cloneThing2.setArrayList("Jerry");
        System.out.println(thing2.getArrayList());
    }
}
