package com.responsibility.example;

/**
 * Created by toryang on 7/14/16.
 */
public class Son extends Handler {

    public Son() {
        super(Handler.SON_LEVEL_REQUEST);
    }

    @Override
    protected void response(IWomen women) {
        System.out.println("-----母亲的向儿子请示-----");
        System.out.println(women.getRequest());
        System.out.println("儿子的答复是: 同意");
    }
}
