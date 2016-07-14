package com.builder.example;

import java.util.ArrayList;

/**
 * Created by toryang on 7/12/16.
 */
public class BMWBuilder extends CarBuilder {
    BMWModel bmwModel = new BMWModel();

    @Override
    public void setSequence(ArrayList<String> sequence) {
        this.bmwModel.setSequence(sequence);
    }

    @Override
    public CarModel getCarModel() {
        return this.bmwModel;
    }
}
