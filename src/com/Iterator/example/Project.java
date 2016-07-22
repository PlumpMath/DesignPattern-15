package com.Iterator.example;

import java.util.ArrayList;

/**
 * Created by toryang on 7/18/16.
 */
public class Project implements IProject {

    private ArrayList<IProject> projects = new ArrayList<IProject>();
    private String name = "";
    private int num = 0;
    private int cost = 0;

    public Project(){}
    public Project(String name, int num, int cost) {
        this.name = name;
        this.num = num;
        this.cost = cost;
    }

    @Override
    public void add(String name, int num, int cost) {
        this.projects.add(new Project(name,num,cost));
    }


    @Override
    public IProjectIterator iterator() {
        return new ProjectIterator(this.projects);
    }

    @Override
    public String getProjectInfo(){
        String info = "";
        info = info + "项目名称是:"+this.name;
        info = info + "\t项目人数:"+ this.num;
        info = info + "\t项目费用:"+this.cost;
        return info;
    }
}
