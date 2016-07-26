package com.observer.example;

import java.util.ArrayList;

/**
 * Created by toryang on 7/21/16.
 */
public class HanFeiZi implements IHanFeiZi,Observable {

    private ArrayList<Observer> observerArrayList = new ArrayList<Observer>();


    @Override
    public void haveBreakfast() {
        System.out.println("i am having breakfast");
        this.notifyObserver("han is having breakfast");
    }

    @Override
    public void haveFun() {
        System.out.println("i am having fun");
        this.notifyObserver("han is having fun");
    }

    @Override
    public void addObserver(Observer observer) {
        this.observerArrayList.add(observer);
    }

    @Override
    public void deleteObserver(Observer observer) {
        this.observerArrayList.remove(observer);
    }

    @Override
    public void notifyObserver(String context) {
        for (Observer observer : observerArrayList){
            observer.update(context);
        }
    }
}
