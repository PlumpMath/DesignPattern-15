package com.memento;


/**
 * Created by toryang on 7/21/16.
 */
public class Caretaker {

    private Memento memento;
    public Memento getMemento(){
        return memento;
    }

    public void setMemento (Memento memento){
        this.memento = memento;
    }

}
