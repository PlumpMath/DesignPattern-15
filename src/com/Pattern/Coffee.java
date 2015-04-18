package com.Pattern;

/**
 * 具体子类，提供了咖啡制备的具体实现
 * Created by Toryang on 2015/4/18.
 */
public class Coffee extends RefreshBeverage {
    @Override
    protected void brew() {
        System.out.println("add boiling walter");
    }

    @Override
    protected void addCondiments() {
        System.out.println("suger and milk");
    }
    /*
    子类选择，通过覆盖的方式挂载钩子函数
     */
    @Override
    protected  boolean isCustomerWantsCondiments(){
        return false;
    }
}
