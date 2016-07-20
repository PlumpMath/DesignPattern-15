package com.strategy;

/**
 * Created by toryang on 7/15/16.
 */
public class Context {
    Calculator calculator;

    public Context(Calculator calculator) {
        this.calculator = calculator;
    }

    public int exec(int a,int b,String sumbol){
        return this.calculator.exec(a, b);
    }
}
