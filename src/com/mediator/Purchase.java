package com.mediator;

/**
 * Created by toryang on 7/13/16.
 */
public class Purchase extends AbstractColleague{

    public Purchase(AbstractMediator mediator) {
        super(mediator);
    }

    public void buyIBMcomputer(int number){
        super.mediator.execute("purchase.buy", number);
    }

    public void refuseBuyIBM(){
        System.out.println("not buy IBM computer");
    }
}
