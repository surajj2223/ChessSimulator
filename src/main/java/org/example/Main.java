package org.example;

import org.example.game.Game;
import org.example.game.InvalidChessPieceException;

public class Main {

    public static void main(String[] args) throws InvalidChessPieceException {
        Game game = new Game();
        game.start();
    }
}