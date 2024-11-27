package org.example.game;

import org.example.game.pieces.King;
import org.example.game.pieces.Pawn;
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
}
