package com.Pattern;

/**
 * 抽象基类，为所有的子类提供一个算法框架
 *
 * 提神饮料
 *
 * Created by Toryang on 2015/4/18.
 */
public abstract class RefreshBeverage {
    /**
     * 制备饮料的模板方法
     * 封装了所有子类共同遵循的算法框架
     */
    public final void prepareBeverageTemplate(){
        boilWalter();

        brew();

        pourInCup();

        if (isCustomerWantsCondiments()){
            addCondiments();
        }
        
    }
    /*
    Hook，钩子函数，提供一个默认或空的实现
    具体的子类可以自行决定是否挂钩或如何挂钩
    询问用户是否加入调料
     */

    protected boolean isCustomerWantsCondiments() {
        return true;
    }

    /*
    基本方法，将水煮沸
     */
    private void boilWalter() {
        System.out.println("boilWalter");
    }

    /*
    抽象的基本方法
     */
    protected abstract void brew();

    /*
    基本方法，将水煮沸
     */
    private void pourInCup() {
        System.out.println("pourInCup");
    }

    /*
    抽象的基本方法
     */
    protected abstract void addCondiments();
}
