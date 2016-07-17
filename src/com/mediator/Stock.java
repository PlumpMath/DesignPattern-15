package com.mediator;

/**
 * Created by toryang on 7/13/16.
 */
public class Stock extends AbstractColleague {
    private static int COMPUTER_COUNT = 100;

    public Stock(AbstractMediator mediator) {
        super(mediator);
    }

    public void increase(int number){
        COMPUTER_COUNT = COMPUTER_COUNT + number;
        System.out.println("库存数量:"+COMPUTER_COUNT);
    }

    public void decrease(int number){
        COMPUTER_COUNT = COMPUTER_COUNT - number;
        System.out.println("库存数量:"+COMPUTER_COUNT);
    }

    public int getStockNumber(){
        return COMPUTER_COUNT;
    }

    public void clearStock(){

        super.mediator.execute("stock.clear");

        System.out.println("清理存活数量为:"+COMPUTER_COUNT);
    }
}
