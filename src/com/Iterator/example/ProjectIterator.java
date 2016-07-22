package com.Iterator.example;

import com.Iterator.example.IProject;
import com.Iterator.example.IProjectIterator;

import java.util.ArrayList;

/**
 * Created by toryang on 7/18/16.
 */
public class ProjectIterator implements IProjectIterator {
    private ArrayList<IProject> projects = new ArrayList<IProject>();
    private int currentItem = 0;

    public ProjectIterator(ArrayList<IProject> projects) {
        this.projects = projects;
    }

    @Override
    public boolean hasNext() {
        boolean b = true;
        if (this.currentItem >= projects.size() ||
                this.projects.get(this.currentItem)==null){
            b = false;
        }
        return b;
    }

    @Override
    public IProject next() {
        return (IProject) this.projects.get(this.currentItem++);
    }

    @Override
    public void remove() {

    }
}
