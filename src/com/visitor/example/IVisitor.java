package com.visitor.example;

/**
 * Created by toryang on 7/21/16.
 */
public interface IVisitor {
    public void visit(CommonEmployee commonEmployee);

    public void visit(Manager manager);

}
