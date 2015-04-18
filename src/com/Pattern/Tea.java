package com.Pattern;

/**
 * 另外一个具体子类，提供了茶制备茶的具体实现
 * Created by Toryang on 2015/4/18.
 */
public class Tea extends RefreshBeverage {
    @Override
    protected void brew() {
        System.out.println("add 80c walter and 5 mintues");
    }

    @Override
    protected void addCondiments() {
        System.out.println("lemon");
    }


}
