package com.singleton.example;

import java.util.ArrayList;
import java.util.Random;
import java.util.StringJoiner;

/**
 * Created by toryang on 7/11/16.
 */
public class Emperor {

    private static int maxNumOfEmperor = 2;

    private static ArrayList<String> namelist = new ArrayList<>();

    private static ArrayList<Emperor> emperors = new ArrayList<>();

    private static int countNumberOfEmperor = 0;

    static {
        for (int i=0;i<5;i++){
            emperors.add(new Emperor("黄"+(i+1)+"帝"));
        }
    }

    private Emperor(){

    }

    private Emperor(String name){
        namelist.add(name);
    }

    public static Emperor getInstance(){
        Random random = new Random();
        countNumberOfEmperor = random.nextInt(maxNumOfEmperor);
        return emperors.get(countNumberOfEmperor);
    }

    public static void say(){
        System.out.println(namelist.get(countNumberOfEmperor));
    }
}
