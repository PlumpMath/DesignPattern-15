package com.visitor;

/**
 * Created by toryang on 7/21/16.
 */
public class Visitor implements IVisitor{
    @Override
    public void visit(ConcreteElement1 el1) {
        el1.doSomething();
    }

    @Override
    public void visit(ConcreteElement2 el2) {
        el2.doSomething();
    }

}
