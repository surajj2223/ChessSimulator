package org.example.game;


public class InvalidInputFormatException extends Exception {

    public InvalidInputFormatException() {
        super("Provided input is invalid. Please enter the input in correct Format such as King, D5");
    }
}

