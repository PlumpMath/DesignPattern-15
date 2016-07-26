package com.observer.example;

import com.observer.example.Observer;

/**
 * Created by toryang on 7/21/16.
 */
public class WangSi implements Observer {
    @Override
    public void update(String context) {
        System.out.println("report1:" + context);
        this.report2other(context);
    }

    private void report2other(String context){
        System.out.println("other1,"+context);
    }
}
