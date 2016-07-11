package com;

import com.factorymethod.example.*;
import com.singleton.example.Emperor;

/**
 * Created by toryang on 7/11/16.
 */
public class Main {

    public static void main(String[] args) {
//        singleton();
        nvWa();
    }

    /**
     * singleton pattern
     */
    private static void singleton(){
        int ministerNum = 5;
        for (int i=0;i<ministerNum;i++) {
            Emperor emperor = Emperor.getInstance();
            System.out.print("第" + (i + 1) + "个大臣参拜的是:");
            emperor.say();
        }
    }

    /**
     * FactoryMethod Pattern
     */
    private static void nvWa(){
        AbstractHumanFactory yingyanglu = new HumanFactory();

        System.out.println("----造出白色人种----");
        Human whiteman = yingyanglu.createHuman(WhiteHuman.class);
        whiteman.getColor();
        whiteman.talk();

        System.out.println("-----造出黑色人种-----");
        Human blackman = yingyanglu.createHuman(BlackHuman.class);
        blackman.getColor();
        blackman.talk();

        System.out.println("-----造出黄色人种------");
        Human yellowHuman = yingyanglu.createHuman(YellowHuman.class);
        yellowHuman.getColor();
        yellowHuman.talk();

    }
}
