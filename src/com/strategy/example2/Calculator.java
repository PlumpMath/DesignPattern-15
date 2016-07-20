package com.strategy.example2;

/**
 * Created by toryang on 7/15/16.
 */
public enum Calculator {
    ADD("+"){
        public int exec(int a,int b){
            return a+b;
        }
    },
    SUB("-"){
        public int exec(int a,int b){
            return a-b;
        }
    };

    String value = "";

    private Calculator(String value){
        this.value = value;
    }

    public String getValue(){
        return value;
    }

    public abstract int exec(int a,int b);

}
