package com.command.example;

/**
 * Created by toryang on 7/14/16.
 */
public class RequirementGroup extends Group {
    @Override
    public void find() {
        System.out.println("find requirement group");
    }

    @Override
    public void add() {
        System.out.println("add a requirement");
    }

    @Override
    public void delete() {
        System.out.println("delete a requirement");
    }

    @Override
    public void change() {
        System.out.println("change a requirement");
    }

    @Override
    public void plan() {
        System.out.println("change the plan");
    }
}
