package com.templatemethod.example;

/**
 * Created by toryang on 7/11/16.
 */
public class HummerH1Model extends HummerModel {
    @Override
    public void start() {
        System.out.println("H1 开始");
    }

    @Override
    public void stop() {
        System.out.println("H1 停止");
    }

    @Override
    public void alarm() {
        System.out.println("H1 鸣笛");
    }

    @Override
    public void engineBoom() {
        System.out.println("H1 引擎发动");
    }
}
