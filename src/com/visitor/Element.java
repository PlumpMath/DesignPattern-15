package com.visitor;

/**
 * Created by toryang on 7/21/16.
 */
public abstract class Element {

    public abstract void doSomething();

    public abstract void accept(IVisitor iVisitor);
}
