package org.example.game.pieces;


import org.example.game.ChessPiece;

import java.util.ArrayList;
import java.util.List;

public class Pawn extends ChessPiece {

    @Override
    public String getName() {
        return "Pawn";
    }

    @Override
    public List<String> getPossibleMoves(String position) {
        List<String> possibleMoves = new ArrayList<>();
        int[] rowColumnPosition = this.getRowColFromPosition(position);
        int newRow = rowColumnPosition[0] + 1;
        int newCol = rowColumnPosition[1];
        if (isValidPosition(newRow, newCol)) {
            String validMove = getPositionFromRowCol(newRow, newCol);
            possibleMoves.add(validMove);
        }
        return possibleMoves;
    }
}
