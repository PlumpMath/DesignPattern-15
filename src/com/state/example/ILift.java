package com.state.example;

/**
 * Created by toryang on 7/22/16.
 */
public interface ILift {
    public static final int OPENING_STATE = 1;
    public static final int CLOSING_STATE = 2;
    public static final int RUNNING_STATE = 3;
    public static final int STOPPING_STATE = 4;

    public void setState(int state);

    public void open();

    public void close();

    public void run();

    public void stop();
}
