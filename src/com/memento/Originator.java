package com.memento;

import javax.swing.*;

/**
 * Created by toryang on 7/21/16.
 */
public class Originator {
    private String state = "";

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }


    public Memento createMemento(){
        return new Memento(this.state);
    }

    public void restoreMemento (Memento memento){
        this.setState(memento.getState());
    }
}
