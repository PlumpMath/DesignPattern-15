package com.Iterator.example;

/**
 * Created by toryang on 7/18/16.
 */
public interface IProject {
    public String getProjectInfo();

    public void add(String name, int num, int cost);

    public IProjectIterator iterator();
}
