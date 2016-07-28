package com.state;

/**
 * Created by toryang on 7/22/16.
 */
public class Client {

    public static void main(String[] args) {
        Context context = new Context();
        context.setCurrentState(new ConcreteState1());
        context.handle1();
        context.handle2();
    }


}
