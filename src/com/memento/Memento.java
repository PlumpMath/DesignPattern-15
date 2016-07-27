package com.memento;

/**
 * Created by toryang on 7/21/16.
 */
public class Memento {

    private String state = "";

    public Memento(String state){
        this.state =state;
    }

    public String getState() {
        return state;
    }

    public void setState(String state){
        this.state =state;
    }
}
