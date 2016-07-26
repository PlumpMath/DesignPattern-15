package com.observer;

/**
 * Created by toryang on 7/21/16.
 */
public class ConcreteSubject extends Subject {

    public void doSomething(){
        super.notifyObserver();
    }

}
