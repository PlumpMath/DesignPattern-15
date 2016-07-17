package com.mediator;

/**
 * Created by toryang on 7/13/16.
 */
public abstract class AbstractColleague{
    protected AbstractMediator mediator;

    public AbstractColleague(AbstractMediator mediator) {
        this.mediator = mediator;
    }
}
