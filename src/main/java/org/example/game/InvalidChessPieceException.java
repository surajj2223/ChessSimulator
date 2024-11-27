package org.example.game;

public class InvalidChessPieceException extends Exception {

    public InvalidChessPieceException(String piece) {
        super("Invalid chess piece with name"+piece);
    }
}

