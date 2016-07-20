package com.decorator;

/**
 * Created by toryang on 7/15/16.
 */
public class ConcreteComponent extends Component{


    @Override
    public void operate() {
        System.out.println("do something");
    }
}
