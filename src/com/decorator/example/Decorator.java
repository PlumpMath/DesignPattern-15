package com.decorator.example;

/**
 * Created by toryang on 7/15/16.
 */
public abstract class Decorator extends SchoolReport{

    private SchoolReport sr;

    public Decorator(SchoolReport sr) {
        this.sr = sr;
    }

    @Override
    public void report() {
        this.sr.report();
    }

    @Override
    public void sign(String name) {
        this.sr.sign(name);
    }
}
