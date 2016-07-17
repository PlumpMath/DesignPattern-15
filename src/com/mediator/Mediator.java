package com.mediator;

/**
 * Created by toryang on 7/13/16.
 */
public class Mediator extends AbstractMediator {
    @Override
    public void execute(String str, Object... objects) {
        if (str.equals("purchase.buy")){

            this.buyComputer((Integer)objects[0]);

        }else if (str.equals("sale.sell")){

            this.sellComputer((Integer)objects[0]);

        }else if (str.equals("sale.offsell")){

            this.offSell();

        }else if (str.equals("stock.clear")){

            this.clearStock();
        }
    }

    private void buyComputer(int number){
        int saleStatus = super.sale.getSaleSatatues();
        if (saleStatus > 80){
            System.out.println("Buy IBM Computer:"+number);
            super.stock.increase(number);
        }else {
            int buyNumber = number/2;
            System.out.println("buy IBM computer:"+buyNumber);
        }
    }

    private void sellComputer(int number){
        if (super.stock.getStockNumber() < number){
            super.purchase.buyIBMcomputer(number);
        }
        super.stock.decrease(number);
    }

    private void offSell(){
        System.out.println("offsell computer:"+stock.getStockNumber());
    }

    private void clearStock(){
        super.sale.offSale();
        super.purchase.refuseBuyIBM();
    }
}
