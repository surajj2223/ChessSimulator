package org.example.game;

import java.util.Scanner;

public class Game {
    private ChessPiece getAppropriateChessPiece(String piece) throws InvalidChessPieceException {
       throw new InvalidChessPieceException(piece);
    }

    public void start() throws InvalidChessPieceException {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String pieceName = input.split(",")[0];
        String currentPos = input.split(",")[1].trim().toUpperCase();
        ChessPiece piece = getAppropriateChessPiece(pieceName);
        String possibleMovesOfPiece = piece.getPossibleMoves(currentPos).toString();
        System.out.println(possibleMovesOfPiece);
    }
}
