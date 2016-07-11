package com.factorymethod;

/**
 * Created by toryang on 7/11/16.
 */
public class Client {

    public static void main(String[] args) {

        Creator creator = new ConcreteCreator();
        Product product = creator.createProduct(ConcreteProduct1.class);
        /*
        处理业务逻辑
         */

    }
}
