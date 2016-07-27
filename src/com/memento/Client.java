package com.memento;

import sun.tools.asm.CatchData;

/**
 * Created by toryang on 7/21/16.
 */
public class Client {
    public static void main(String[] args) {
        Originator originator = new Originator();

        Caretaker caretaker = new Caretaker();

        caretaker.setMemento(originator.createMemento());

        originator.restoreMemento(caretaker.getMemento());
    }
}
