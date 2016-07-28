package com.state.example;

import com.state.example.Context;
import com.state.example.LiftState;

/**
 * Created by toryang on 7/22/16.
 */
public class StoppingState extends LiftState {
    @Override
    public void open() {
        super.context.setLiftState(Context.openningState);
        super.context.getLiftState().open();
    }

    @Override
    public void close() {


    }

    @Override
    public void run() {
        super.context.setLiftState(Context.runningState);
        super.context.getLiftState().run();
    }

    @Override
    public void stop() {
        System.out.println("lift stop");
    }
}
