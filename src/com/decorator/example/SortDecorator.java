package com.decorator.example;

/**
 * Created by toryang on 7/15/16.
 */
public class SortDecorator extends  Decorator{

    public SortDecorator(SchoolReport sr) {
        super(sr);
    }

    private void reportSort(){
        System.out.println("range 37");
    }

    @Override
    public void report() {
        super.report();
        this.reportSort();
    }
}
