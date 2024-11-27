package org.example.game;

import java.util.List;

/**
 * Represents a ChessPiece in abstract sense that actual implementations could inherit from.
 * For eg: King IS-A ChessPiece, Queen IS-A Chess Piece, etc.
 * This will help evolve the definitions independently as we increase the KIND-of pieces in solution.
 */
public abstract class ChessPiece {

    public abstract String getName();

    public abstract List<String> getPossibleMoves(String position);

    /**
     * Helps obtain a readable position of the piece with given row and column data.
     * @param row - integer identification of the row number
     * @param col - integer identification of the column number
     * @return
     */
    public String getPositionFromRowCol(int row, int col) {
        return (char)col +""+row;
    }

    /**
     * Converts the readable position to row and column identifiers such as D4 to row - 4, Column D
     * @param position - string representation for the array position of the chess piece.
     * @return Int[] {row, column}
     */
    public int[] getRowColFromPosition(String position) {
        return new int[] {position.charAt(1) - '0', position.charAt(0)};
    }

    /**
     * Ensures that given a row, column position, a chess piece doesnt overflow the edges of board.
     * @param row
     * @param col
     * @return weather a chess piece can be placed on the given row, column
     */
    public boolean isValidPosition(int row, int col) {
        return row >= 1 && row <=8 && col >= 'A' && col <= 'H';
    }
}


