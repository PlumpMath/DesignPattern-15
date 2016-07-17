package com.prototype;

import java.util.ArrayList;

/**
 * Created by toryang on 7/13/16.
 *
 * 浅拷贝
 */
public class Thing1 implements Cloneable{

    private ArrayList<String> arrayList = new ArrayList<>();

    @Override
    public Thing1 clone() {
        Thing1 thing1 = null;
        try {
            thing1 = (Thing1)super.clone();
        }catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
        return thing1;
    }


    public void setArrayList(String value){
        this.arrayList.add(value);
    }

    public ArrayList<String> getArrayList() {
        return this.arrayList;
    }
}
