package com.Strategy;

/**
 * Created by Toryang on 2015/4/20.
 */
public class DuckTest {
    public static void main(String[] args){
        System.out.println("test duck");
        Duck duck = null;
        //duck = new MallardDuck();
        //duck = new RedheadDuck();
        //duck = new RubberDuck();
        duck = new BigYello();

        duck.Display();
        duck.quack();
        duck.fly();

        System.out.println("test over");
    }

}
