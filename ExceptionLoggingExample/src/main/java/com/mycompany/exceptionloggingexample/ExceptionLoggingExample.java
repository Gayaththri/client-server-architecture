/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exceptionloggingexample;

/**
 *
 * @author Gayaththri
 */
import java.util.logging.Logger;

public class ExceptionLoggingExample {
    private static final Logger logger = Logger.getLogger(ExceptionLoggingExample.class.getName());

    public static void main(String[] args) {
        try {
            // Some code that may throw an exception
            throw new RuntimeException("This is a sample exception.");
        } catch (Exception e) {
            logger.severe("An exception occurred: " + e.getMessage());
            logger.severe("Stack trace: ");
            for (StackTraceElement element : e.getStackTrace()) {
                logger.severe(element.toString());
            }
        }
    }
}

