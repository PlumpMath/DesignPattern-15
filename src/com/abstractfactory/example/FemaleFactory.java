package com.abstractfactory.example;

/**
 * Created by toryang on 7/11/16.
 */
public class FemaleFactory implements HumanFactory {

    @Override
    public Human createYellowHuman() {
        return new FemaleYellowHuman();
    }

    @Override
    public Human createWhiteHuman() {
        return new FemaleWhiteHuman();
    }

    @Override
    public Human createBlackHuman() {
        return new FemaleBlackHuman();
    }
}
