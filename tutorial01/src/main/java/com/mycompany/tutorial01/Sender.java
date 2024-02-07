/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tutorial01;

/**
 *
 * @author Gayaththri
 */
import java.util.logging.Logger;

public class Sender {
    private static final Logger logger = Logger.getLogger(Sender.class.getName());

    public Message createMessage() {
        Message message = new Message("This is a message");
        logger.info("Message created");
        return message;
    }

    public void sendMessage(Receiver receiver) {
        Message message = createMessage();
        logger.info("Sending message to the receiver");
        receiver.receiveMessage(message);
    }
}



