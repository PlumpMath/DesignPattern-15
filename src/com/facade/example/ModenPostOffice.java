package com.facade.example;

/**
 * Created by toryang on 7/21/16.
 */
public class ModenPostOffice  {

    private ILetterProcess iLetterProcess = new LetterProcessImpl();
    private Police letterpolice = new Police();

    public void sendLetter(String context,String address){
        iLetterProcess.writeContext(context);
        iLetterProcess.fillEnvelope(address);
        letterpolice.checkLetter(iLetterProcess);
        iLetterProcess.letterIntoEnvelop();
        iLetterProcess.sendLetter();
    }
}
