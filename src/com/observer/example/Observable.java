package com.observer.example;

/**
 * Created by toryang on 7/21/16.
 */
public interface Observable {

    public void addObserver(Observer observer);

    public void deleteObserver (Observer observer);

    public void notifyObserver (String context);

}
