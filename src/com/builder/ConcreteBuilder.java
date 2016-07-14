package com.builder;

import com.builder.Builder;
import com.builder.Product;

/**
 * Created by toryang on 7/12/16.
 */
public class ConcreteBuilder extends Builder {
    private Product product;


    @Override
    public void setPart() {

    }

    @Override
    public Product builderProduct() {
        return product;
    }
}
