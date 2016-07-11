package com.factorymethod.example;

/**
 * Created by toryang on 7/11/16.
 */
public class HumanFactory extends AbstractHumanFactory {

    @Override
    public <T extends Human> T createHuman(Class<T> c) {
        Human human = null;
        try {
            human = (Human) Class.forName(c.getName()).newInstance();
        }catch (Exception e){
            System.out.println("error");
        }

        return (T)human;
    }
}
