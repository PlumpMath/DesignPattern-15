package com.mediator;

import java.util.Random;

/**
 * Created by toryang on 7/13/16.
 */
public class Sale extends AbstractColleague  {

    public Sale(AbstractMediator mediator) {
        super(mediator);
    }

    public void sellIBMComputer(int number){
        super.mediator.execute("sale.sell",number);
        System.out.println("sell IMB Computer:"+number);
    }

    public int getSaleSatatues(){
        Random random = new Random(System.currentTimeMillis());
        int saleStatus = random.nextInt(100);
        System.out.println("IMB computer sell:"+saleStatus);
        return saleStatus;
    }

    public void offSale(){
        super.mediator.execute("sale.offsell");
    }
}
