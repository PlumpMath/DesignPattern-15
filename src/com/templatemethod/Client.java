package com.templatemethod;

/**
 * Created by toryang on 7/11/16.
 */
public class Client {
    public static void main(String[] args) {
        AbstractClass class1 = new ConcreteClass();
        AbstractClass class2 = new ConcreteClass2();

        class1.templateMethod();
        class2.templateMethod();
    }

}
