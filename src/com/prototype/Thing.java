package com.prototype;

/**
 * Created by toryang on 7/13/16.
 *
 * 简单拷贝
 */
public class Thing implements Cloneable {

    public Thing(){
        System.out.println("Constructor is called");
    }
    @Override
    public Thing clone() {
        Thing thing = null;
        try {
            thing = (Thing)super.clone();
        }catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
        return thing;
    }
}
