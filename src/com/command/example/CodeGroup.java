package com.command.example;

/**
 * Created by toryang on 7/14/16.
 */
public class CodeGroup extends Group {

    @Override
    public void find() {
        System.out.println("find the code group");
    }

    @Override
    public void add() {
        System.out.println("add some code");
    }

    @Override
    public void delete() {
        System.out.println("delete some code");
    }

    @Override
    public void change() {
        System.out.println("change some code");
    }

    @Override
    public void plan() {
        System.out.println("change the plan");
    }
}
