package com.command.example;

/**
 * Created by toryang on 7/14/16.
 */
public class PageGroup extends Group {

    @Override
    public void find() {
        System.out.println("find page group!");
    }

    @Override
    public void add() {
        System.out.println("add a page");
    }

    @Override
    public void delete() {
        System.out.println("delete a page");

    }

    @Override
    public void change() {
        System.out.println("change a page");
    }

    @Override
    public void plan() {
        System.out.println("change a page plan");
    }
}
