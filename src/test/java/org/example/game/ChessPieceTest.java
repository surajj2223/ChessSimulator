package org.example.game;

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

        // Expected move for a Pawn at D5 (one step forward)
        List<String> expectedMoves = List.of("D6");

        assertEquals(expectedMoves.size(), possibleMoves.size());
        assertTrue(possibleMoves.containsAll(expectedMoves));
    }
}
