package org.example.game;

import org.example.game.pieces.King;
import org.example.game.pieces.Pawn;
import org.example.game.pieces.Queen;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ChessPieceTest {

    @Test
    void testPawnMoves() {
        ChessPiece pawn = new Pawn();
        List<String> possibleMoves = pawn.getPossibleMoves("D5");

        // Only expected move for a Pawn at D5 (one step forward)
        List<String> expectedMoves = List.of("D6");

        assertEquals(expectedMoves.size(), possibleMoves.size());
        assertTrue(possibleMoves.containsAll(expectedMoves));
    }

    @Test
    void testPawnEdgeMoves() {
        ChessPiece pawn = new Pawn();
        List<String> possibleMoves = pawn.getPossibleMoves("D8");

        assertEquals(0, possibleMoves.size());
        assertTrue(possibleMoves.isEmpty());
    }

    @Test
    void testKingMoves() {
        ChessPiece king = new King();
        List<String> possibleMoves = king.getPossibleMoves("D5");

        // Expected moves for a King at D5
        List<String> expectedMoves = List.of("C4", "C5", "C6", "D4", "D6", "E4", "E5", "E6");

        assertEquals(expectedMoves.size(), possibleMoves.size());
        assertTrue(possibleMoves.containsAll(expectedMoves));
    }

    @Test
    void testKingEdgeMoves() {
        ChessPiece king = new King();
        List<String> possibleMoves = king.getPossibleMoves("A1");

        // Expected moves for a King at A1
        List<String> expectedMoves = List.of("A2", "B1", "B2");

        assertEquals(expectedMoves.size(), possibleMoves.size());
        assertTrue(possibleMoves.containsAll(expectedMoves));
    }

    @Test
    void testQueenMoves() {
        ChessPiece queen = new Queen();
        List<String> possibleMoves = queen.getPossibleMoves("D5");

        // Expected moves for a Queen at D5
        List<String> expectedMoves = List.of(
                "C4", "B3", "A2", "E6", "F7", "G8",
                "C6", "B7", "A8",
                "E4", "F3", "G2", "H1",
                "C5", "B5", "A5",
                "D4", "D3", "D2", "D1",
                "D6", "D7", "D8",
                "E5", "F5", "G5", "H5"
        );

        assertEquals(expectedMoves.size(), possibleMoves.size());
        assertTrue(possibleMoves.containsAll(expectedMoves));
    }

    @Test
    void testQueenEdgeMoves() {
        ChessPiece queen = new Queen();
        List<String> possibleMoves = queen.getPossibleMoves("H1");

        // Expected moves for a Queen at H1
        List<String> expectedMoves = List.of(
                "G1", "F1", "E1", "D1", "C1", "B1", "A1",
                "H2", "H3", "H4", "H5", "H6", "H7", "H8",
                "G2", "F3", "E4", "D5", "C6", "B7", "A8"
        );

        assertEquals(expectedMoves.size(), possibleMoves.size());
        assertTrue(possibleMoves.containsAll(expectedMoves));
    }
}
