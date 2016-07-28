package com.visitor;

import java.util.Random;

/**
 * Created by toryang on 7/21/16.
 */
public class ObjectStruture {

    public static Element createElement(){
        Random random = new Random();
        if (random.nextInt(100) > 50){
            return new ConcreteElement1();
        }else {
            return new ConcreteElement2();
        }

    }
}
