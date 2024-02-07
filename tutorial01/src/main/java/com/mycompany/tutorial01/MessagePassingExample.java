/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.tutorial01;

/**
 *
 * @author Gayaththri
 */
import java.util.logging.ConsoleHandler;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MessagePassingExample {
    private static final Logger logger = Logger.getLogger(MessagePassingExample.class.getName());

    public static void main(String[] args) {
        configureLogger(); // Call the method to configure logging
        
        Sender sender = new Sender();
        Receiver receiver = new Receiver();

        // Use the Sender instance to create a message and send it to the Receiver
        sender.createMessage();
        sender.sendMessage(receiver);
    }

    // Method to configure the logger
    private static void configureLogger() {
        try {
            // Configure global logging level
            Logger globalLogger = Logger.getLogger("");
            Handler[] handlers = globalLogger.getHandlers();

            for (Handler handler : handlers) {
                globalLogger.removeHandler(handler);
            }
            
            ConsoleHandler consoleHandler = new ConsoleHandler();
            consoleHandler.setLevel(Level.ALL);
            globalLogger.addHandler(consoleHandler);
            globalLogger.setLevel(Level.ALL);
        } catch (Exception e) {
            Logger.getGlobal().log(Level.SEVERE, "Error configuring logger: " + e.getMessage(), e);
        }
    }
}
