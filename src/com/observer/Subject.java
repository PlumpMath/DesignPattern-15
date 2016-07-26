package com.observer;

import java.util.Vector;

/**
 * Created by toryang on 7/21/16.
 */
public abstract class Subject {

    private Vector<Observer> obsVector = new Vector<>();

    public void addObserver (Observer observer){
        this.obsVector.add(observer);
    }

    public void deleteObserver (Observer observer){
        this.obsVector.remove(observer);
    }

    public void notifyObserver(){
        for (Observer observer : this.obsVector){
            observer.update();
        }
    }
}
