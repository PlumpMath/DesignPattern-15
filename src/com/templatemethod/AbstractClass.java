package com.templatemethod;

/**
 * Created by toryang on 7/11/16.
 */
public abstract class AbstractClass {
    protected abstract void doSomething();

    protected abstract void doAnything();

    public void templateMethod(){
        this.doAnything();
        this.doSomething();
    }

}
