package org.example.game;

import org.example.game.pieces.King;
import org.example.game.pieces.Pawn;

import java.util.Scanner;

public class Game {
    private ChessPiece getAppropriateChessPiece(String piece) throws InvalidChessPieceException {
        if (piece.equalsIgnoreCase("pawn")) {
            return new Pawn();
        } else if (piece.equalsIgnoreCase("king")) {
            return new King();
        } else {
            throw new InvalidChessPieceException(piece);
        }
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
