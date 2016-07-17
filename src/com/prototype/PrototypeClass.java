package com.prototype;

/**
 * Created by toryang on 7/13/16.
 *
 * 原型模式通用代码
 */
public class PrototypeClass implements Cloneable{

    @Override
    public PrototypeClass clone() {
        PrototypeClass prototypeClass = null;

        try{
            prototypeClass = (PrototypeClass)super.clone();
        }catch (CloneNotSupportedException e){
            e.printStackTrace();
        }

        return prototypeClass;
    }
}
