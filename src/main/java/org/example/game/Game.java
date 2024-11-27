package org.example.game;

import org.example.game.pieces.King;
import org.example.game.pieces.Pawn;
import org.example.game.pieces.Queen;

import java.util.Scanner;

public class Game {
    private ChessPiece getAppropriateChessPiece(String piece) throws InvalidChessPieceException {
        if (piece.equalsIgnoreCase("pawn")) {
            return new Pawn();
        } else if (piece.equalsIgnoreCase("king")) {
            return new King();
        } else if (piece.equalsIgnoreCase("queen")) {
            return new Queen();
        } else {
            throw new InvalidChessPieceException(piece);
        }
    }

    private boolean isValidInputPosition(String position) {
        int row = position.charAt(1) - '0';
        int column = position.charAt(0);
        return row >=1 && row <=8 && column >= 'A' && column <= 'H';
    }

    public void start() throws InvalidChessPieceException, InvalidInputFormatException {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        if (input.contains(",")) {
            String pieceName = input.split(",")[0];
            String currentPos = input.split(",")[1].trim().toUpperCase();
            ChessPiece chessPiece = getAppropriateChessPiece(pieceName);
            if (isValidInputPosition(currentPos)) {
                String possibleMoves = chessPiece.getPossibleMoves(currentPos).toString();
                System.out.println(possibleMoves);
            } else {
                System.err.println("Position entered is out of range for a 8X8 chess board." +
                        "Please re-enter the input with valid position.");
                start();
            }
        } else {
            throw new InvalidInputFormatException();
        }
    }
}
