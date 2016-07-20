package com.strategy.example2;

/**
 * Created by toryang on 7/15/16.
 */
public class Client {

    public static void main(String[] args) {
        System.out.println("输入的参数:1+2");
        System.out.println("运行的结果:1+2="+Calculator.ADD.exec(1,2));
    }
}
