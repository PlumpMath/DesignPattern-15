package com.prototype;

import java.util.ArrayList;

/**
 * Created by toryang on 7/13/16.
 *
 * 深拷贝
 */
public class Thing2 implements Cloneable {

    private ArrayList<String> arrayList = new ArrayList<>();

    @Override
    public Thing2 clone() {
        Thing2 thing2 = null;
        try {
            thing2 = (Thing2)super.clone();
            arrayList = (ArrayList<String>)this.arrayList.clone();
        }catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
        return thing2;
    }

    public void setArrayList(String value){
        this.arrayList.add(value);
    }

    public ArrayList<String> getArrayList() {
        return this.arrayList;
    }
}

