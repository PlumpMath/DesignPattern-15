package com.proxy;

import java.util.Objects;

/**
 * Created by toryang on 7/12/16.
 */
public class Proxy implements Subject {
    private Subject subject = null;

    public Proxy() {
        this.subject = new Proxy();
    }

    public Proxy(Object... objects){

    }

    @Override
    public void request() {
        this.before();
        this.subject.request();
        this.after();
    }

    private void before(){

    }

    private void after(){

    }
}
