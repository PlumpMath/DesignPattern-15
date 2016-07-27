package com.facade.example;

/**
 * Created by toryang on 7/21/16.
 */
public interface ILetterProcess {

    public void writeContext(String context);

    public void fillEnvelope(String address);

    public void letterIntoEnvelop();

    public void sendLetter();
}
