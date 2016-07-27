package com.memento.example;

/**
 * Created by toryang on 7/21/16.
 */
public class Boy {
    private String state = "";

    public void changeState(){
        this.state = "bad mood";
    }

    public String getState(){
        return state;
    }

    public void setState(String state){
        this.state = state;
    }

    public Memento createMemento (){
        return new Memento(this.state);
    }

    public void restoreMemento (Memento memento){
        this.setState(memento.getState());
    }

}
