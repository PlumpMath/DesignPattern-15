package com.observer.example;

/**
 * Created by toryang on 7/21/16.
 */
public class LiuSi implements Observer {

    @Override
    public void update(String context) {
        System.out.println("report2:" + context);
        this.report2other(context);
    }

    private void report2other(String context){
        System.out.println("other2,"+context);
    }
}
