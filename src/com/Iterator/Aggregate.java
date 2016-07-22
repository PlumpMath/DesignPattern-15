package com.Iterator;

/**
 * Created by toryang on 7/18/16.
 */
public interface Aggregate {

    public  void add(Object object);

    public void remove (Object object);

    public Iterator iterator();
}
