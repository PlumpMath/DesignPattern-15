package com.composite;

import java.util.ArrayList;

/**
 * Created by toryang on 7/19/16.
 */
public class Branch extends Crop {

    private String name = "";
    private String position = "";
    private int salary = 0;

    ArrayList<Crop> subordinateList = new ArrayList<Crop>();

    public Branch(String name, String position, int salary) {
        super(name, position, salary);
    }

    @Override
    public String getInfo() {
        String info = "";
        info = "name:"+name;
        info += "\t position:"+position;
        info += "\t salary" + salary;
        return info;
    }

    public void addSubordinate(Crop Crop) {
        this.subordinateList.add(Crop);
    }

    public ArrayList<Crop> getSubordinate() {
        return this.subordinateList;
    }
}
