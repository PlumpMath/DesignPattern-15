package com.factorymethod.example;

import static javafx.scene.input.KeyCode.T;

/**
 * Created by toryang on 7/11/16.
 */
public abstract class AbstractHumanFactory {

    public abstract <T extends Human> T createHuman(Class<T> c);


}
