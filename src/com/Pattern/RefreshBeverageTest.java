package com.Pattern;

/**
 * Created by Toryang on 2015/4/18.
 */
public class RefreshBeverageTest  {
    public static void main(String[] args){
        System.out.println("making coffee");
        RefreshBeverage b1 = new Coffee();
        b1.prepareBeverageTemplate();
        System.out.println("Coffee is okay");

        System.out.println("\n++++++++++++++++++++++++");

        System.out.println("making tea");
        RefreshBeverage b2 = new Tea();
        b2.prepareBeverageTemplate();
        System.out.println("tea is okay");
    }
}
