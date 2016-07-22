package com.Iterator;

import java.util.Vector;

/**
 * Created by toryang on 7/18/16.
 */
public class ConcreteAggregate implements Aggregate {

    private Vector vector = new Vector();


    @Override
    public void add(Object object) {
        this.vector.add(object);
    }

    @Override
    public void remove(Object object) {
        this.remove(object);
    }

    @Override
    public Iterator iterator() {
        return new ConcreteIterator(this.vector);
    }
}
