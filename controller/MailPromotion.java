package controller;

import services.MailDistributor;
import services.MailService;

import java.util.List;

public class MailPromotion  {
    MailService tmp;
    void sendToObject(String from, String to, String message){
        List<Object> receivers=tmp.getReceivers(to);
    }

}
