package com.visitor;

/**
 * Created by toryang on 7/21/16.
 */
public class Client  {
    public static void main(String[] args) {
        for (int i=0;i<10;i++){
            Element element = ObjectStruture.createElement();
            element.accept(new Visitor());
        }
    }
}
