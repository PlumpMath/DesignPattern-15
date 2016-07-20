package com.decorator.example;

/**
 * Created by toryang on 7/15/16.
 */
public class HighScoreDecorator extends Decorator {

    public HighScoreDecorator(SchoolReport sr) {
        super(sr);
    }

    private void reportHighScore(){
        System.out.println("Chinese 75, Math 78, Mature 80");
    }

    @Override
    public void report() {
        this.reportHighScore();
        super.report();
    }
}
