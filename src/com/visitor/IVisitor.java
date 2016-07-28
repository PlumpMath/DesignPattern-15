package com.visitor;

import com.observer.ConcreteSubject;

/**
 * Created by toryang on 7/21/16.
 */
public interface IVisitor {
    public void visit(ConcreteElement1 el1);
    public void visit(ConcreteElement2 el2);

}
