package com.templatemethod.example;

/**
 * Created by toryang on 7/11/16.
 */
public class HummerH2Model extends HummerModel {

    @Override
    public void start() {
        System.out.println("H2 开始");
    }

    @Override
    public void stop() {
        System.out.println("H2 停止");
    }

    @Override
    public void alarm() {
        System.out.println("H2 鸣笛");
    }

    @Override
    public void engineBoom() {
        System.out.println("H2 引擎发动");
    }
}
