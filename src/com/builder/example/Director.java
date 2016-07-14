package com.builder.example;

import java.util.ArrayList;

/**
 * Created by toryang on 7/12/16.
 */
public class Director {
    private ArrayList<String> sequence = new ArrayList<>();
    private BenzBuilder benzBuilder = new BenzBuilder();
    private BMWBuilder bmwBuilder = new BMWBuilder();

    public BenzModel getABenzModel(){
        this.sequence.clear();
        this.sequence.add("start");
        this.sequence.add("stop");

        this.benzBuilder.setSequence(sequence);

        return (BenzModel) this.benzBuilder.getCarModel();
    }

    public BenzModel getBBenzModel(){
        this.sequence.clear();
        this.sequence.add("engine boom");
        this.sequence.add("stop");
        this.sequence.add("start");

        this.benzBuilder.setSequence(sequence);
        return (BenzModel)this.benzBuilder.getCarModel();
    }

    public BMWModel getABMWModel(){
        this.sequence.clear();
        this.sequence.add("stop");
        this.sequence.add("alarm");
        this.bmwBuilder.setSequence(sequence);
        return (BMWModel)this.bmwBuilder.getCarModel();
    }

    public BMWModel getBBMWModel(){
        this.sequence.clear();
        this.sequence.add("stop");
        this.sequence.add("start");
        this.sequence.add("engine boom");
        this.bmwBuilder.setSequence(sequence);
        return (BMWModel)this.bmwBuilder.getCarModel();
    }
}
