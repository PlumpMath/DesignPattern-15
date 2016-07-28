package com.state;

/**
 * Created by toryang on 7/22/16.
 */
public class Context {
    public static final State STATE1 = new ConcreteState1();
    public static final State STATE2 = new ConcreteState2();

    private State CurrentState;

    public State getCurrentState() {
        return CurrentState;
    }

    public void setCurrentState(State currentState) {
        CurrentState = currentState;
        this.CurrentState.setContext(this);
    }

    public void handle1(){
        this.CurrentState.handle1();
    }

    public void handle2(){
        this.CurrentState.handle2();
    }

}
