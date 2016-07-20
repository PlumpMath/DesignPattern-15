package com.decorator;

/**
 * Created by toryang on 7/15/16.
 */
public class Decorator extends Component{
    private Component component = null;
    public Decorator(Component component){
        this.component = component;
    }

    @Override
    public void operate() {
        this.component.operate();
    }
}
