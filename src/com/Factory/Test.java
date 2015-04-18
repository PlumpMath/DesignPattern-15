package com.Factory;

/**
 * Created by Toryang on 2015/4/18.
 */
public class Test {
    public static void main(String[] args){
        //工厂方法模式
//        HairFactory factory = new HairFactory();
//        HairInterface left = factory.getHair("left");
//        left.draw();

//        HairFactory factory = new HairFactory();
//        HairInterface left = factory.getHairByClass("com.Factory.LeftHair");
//        left.draw();
        HairFactory factory = new HairFactory();
        HairInterface hair = factory.getHairByClassKey("right");
        hair.draw();
        HairInterface inHair = factory.getHairByClassKey("in");
        inHair.draw();

        //抽象工厂模式

        PersonFactory factory02= new MCFactory();
        Girl girl = factory02.getGirl();
        girl.DrawGirl();

        PersonFactory factory03 = new HNFactory();
        Boy boy = factory03.getBoy();
        boy.DrawBoy();
    }
}
