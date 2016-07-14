package com.builder.example;

import java.util.ArrayList;

/**
 * Created by toryang on 7/12/16.
 */
public abstract class CarBuilder {

    public abstract void setSequence(ArrayList<String> sequence);

    public abstract CarModel getCarModel();
}
