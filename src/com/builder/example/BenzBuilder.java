package com.builder.example;

import java.util.ArrayList;

/**
 * Created by toryang on 7/12/16.
 */
public class BenzBuilder extends CarBuilder {
    private BenzModel benzModel = new BenzModel();

    @Override
    public void setSequence(ArrayList<String> sequence) {
        this.benzModel.setSequence(sequence);
    }

    @Override
    public CarModel getCarModel() {
        return this.benzModel;
    }
}
