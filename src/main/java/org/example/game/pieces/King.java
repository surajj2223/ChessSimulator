package org.example.game.pieces;


import org.example.game.ChessPiece;

import java.util.ArrayList;
import java.util.List;

/**
 * Implementation of King ChessPiece.
 */
public class King extends ChessPiece {

    @Override
    public String getName() {
        return "King";
    }

    @Override
    public List<String> getPossibleMoves(String position) {
        List<String> possibleMoves = new ArrayList<>();
        int[] rowColumnPosition = this.getRowColFromPosition(position);

        int[] rowsOffset = new int[] {-1, -1, -1, 0,0, 1,1,1};
        int[] columnsOffset = new int[] {-1, 0, 1, -1, 1, -1, 0, 1};

        for (int i = 0; i<8; i++) {
            int newRow = rowColumnPosition[0] + rowsOffset[i];
            int newCol = rowColumnPosition[1] + columnsOffset[i];
            if (isValidPosition(newRow, newCol)) {
                String validMove = getPositionFromRowCol(newRow, newCol);
                possibleMoves.add(validMove);
            }
        }
        return possibleMoves;
    }
}
