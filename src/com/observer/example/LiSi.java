package com.observer.example;

/**
 * Created by toryang on 7/21/16.
 */
public class LiSi implements Observer {
    @Override
    public void update(String context) {
        System.out.println("report:" + context);
        this.report2other(context);
    }

    private void report2other(String context){
        System.out.println("other,"+context);
    }

}
