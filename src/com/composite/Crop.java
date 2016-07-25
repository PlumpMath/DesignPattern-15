package com.composite;

/**
 * Created by toryang on 7/19/16.
 */
public abstract class Crop {

    private String name = "";
    private String position = "";
    private int salary = 0;

    public Crop(String name, String position, int salary) {
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    public String getInfo() {
        String info = "";
        info = "name:"+name;
        info += "\t position:"+position;
        info += "\t salary" + salary;
        return info;
    }
}
