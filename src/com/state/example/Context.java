package com.state.example;

/**
 * Created by toryang on 7/22/16.
 */
public class Context {

    public static final OpenningState openningState = new OpenningState();
    public static final ClosingState closingState = new ClosingState();
    public static final RunningState runningState = new RunningState();
    public static final StoppingState stoppingState = new StoppingState();

    LiftState liftState;

    public void setLiftState(LiftState liftState) {
        this.liftState = liftState;
        this.liftState.setContext(this);
    }

    public LiftState getLiftState() {
        return liftState;
    }

    public void open(){
        this.liftState.open();
    }

    public void stop(){
        this.liftState.stop();
    }

    public void run(){
        this.liftState.run();
    }

    public void close(){
        this.liftState.stop();
    }
}
