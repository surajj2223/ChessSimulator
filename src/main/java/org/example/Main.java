package org.example;

import org.example.game.Game;
import org.example.game.InvalidChessPieceException;
import org.example.game.InvalidInputFormatException;

public class Main {

    public static void main(String[] args) throws InvalidChessPieceException, InvalidInputFormatException {
        Game game = new Game();
        game.start();
    }
}