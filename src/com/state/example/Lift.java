package com.state.example;

/**
 * Created by toryang on 7/22/16.
 */
public class Lift implements ILift {

    private int state;
    @Override
    public void setState(int state) {
        this.state = state;
    }

    @Override
    public void open() {
        switch (this.state){
            case OPENING_STATE:
                break;
            case CLOSING_STATE:
                this.openWithoutLogic();
                this.setState(OPENING_STATE);
                break;
            case RUNNING_STATE:
                break;
            case STOPPING_STATE:
                this.openWithoutLogic();
                this.setState(OPENING_STATE);
                break;
        }
    }

    @Override
    public void close() {
        switch (this.state){
            case OPENING_STATE:
                this.closeWithoutLogic();
                this.setState(CLOSING_STATE);
                break;
            case CLOSING_STATE:
                break;
            case RUNNING_STATE:
                break;
            case STOPPING_STATE:
                break;
        }
    }

    @Override
    public void run() {
        switch (this.state){
            case OPENING_STATE:
                break;
            case CLOSING_STATE:
                this.runWithoutLogic();
                this.setState(RUNNING_STATE);
                break;
            case RUNNING_STATE:
                break;
            case STOPPING_STATE:
                this.runWithoutLogic();
                this.setState(RUNNING_STATE);
                break;
        }
    }

    @Override
    public void stop() {
        switch (this.state){
            case OPENING_STATE:
                break;
            case CLOSING_STATE:
                this.stopWithoutLogic();
                this.setState(CLOSING_STATE);
                break;
            case RUNNING_STATE:
                this.stopWithoutLogic();
                this.setState(CLOSING_STATE);
                break;
            case STOPPING_STATE:
                break;
        }
    }


    private void closeWithoutLogic(){
        System.out.println("Lift is closing");
    }

    private void openWithoutLogic(){
        System.out.println("Lift is opening");
    }

    private void runWithoutLogic(){
        System.out.println("Lift is running");
    }

    private void stopWithoutLogic(){
        System.out.println("Lift is stopping");
    }
}
