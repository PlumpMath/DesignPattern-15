package com.Strategy;

/**
 * 超类，所有鸭子类需要继承此类
 * 抽象了鸭子的行为：显示和鸣叫
 *
 * Created by Toryang on 2015/4/20.
 */
public abstract class Duck {
    /**
     * 通用行为，由超类实现
     */
//    public void quack(){
//        System.out.println("guagua");
//    }

    /**
     * 显示鸭子外观
     */
    public abstract void Display();

    private FlyingStrategy flyingStrategy;

    public void setFlyingStrategy(FlyingStrategy flyingStrategy) {
        this.flyingStrategy = flyingStrategy;
    }

    public void fly(){
        flyingStrategy.performFly();
    }

    public QuackStrategy quackStrategy;

    public void setQuackStrategy(QuackStrategy quackStrategy) {
        this.quackStrategy = quackStrategy;
    }

    public void quack(){
        quackStrategy.performQuack();
    }
}
