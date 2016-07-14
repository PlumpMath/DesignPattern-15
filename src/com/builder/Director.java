package com.builder;

/**
 * Created by toryang on 7/12/16.
 */
public class Director {
    private Builder builder = new ConcreteBuilder();

    public Product getAProduct(){
        builder.setPart();
        return builder.builderProduct();
    }


}
