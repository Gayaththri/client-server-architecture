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

public class Receiver {
    private static final Logger logger = Logger.getLogger(Receiver.class.getName());
    
    // Method to receive and process a message
    public void receiveMessage(Message message) {
        logger.info("Message received: " + message.getContent());
    }
}

