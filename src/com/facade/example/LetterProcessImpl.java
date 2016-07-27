package com.facade.example;

/**
 * Created by toryang on 7/21/16.
 */
public class LetterProcessImpl implements ILetterProcess {

    @Override
    public void writeContext(String context) {
        System.out.println("write context:"+context);
    }

    @Override
    public void fillEnvelope(String address) {
        System.out.println("write address:"+address);
    }

    @Override
    public void letterIntoEnvelop() {
        System.out.println("letter into envelop");
    }

    @Override
    public void sendLetter() {
        System.out.println("send letter");
    }
}
