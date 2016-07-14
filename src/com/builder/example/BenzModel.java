package com.builder.example;

/**
 * Created by toryang on 7/12/16.
 */
public class BenzModel extends CarModel {


    @Override
    protected void start() {
        System.out.println("Benz run");
    }

    @Override
    protected void alarm() {
        System.out.println("Benz alarm");
    }

    @Override
    protected void engineBoom() {
        System.out.println("Benz engine boom");

    }

    @Override
    protected void stop() {
        System.out.println("Benz stop");
    }
}
