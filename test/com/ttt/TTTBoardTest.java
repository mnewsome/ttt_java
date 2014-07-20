package com.ttt;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TTTBoardTest {
    private TTTBoard tttBoard;

    @Before
    public void initTTTBoard() {
       tttBoard = new TTTBoard(9);
    }

    @Test
    public void testCurrentPlayer() {
        tttBoard.fillSpaceAt(1, "x");
        assertTrue(tttBoard.currentPlayer() == "o");

        tttBoard.fillSpaceAt(2, "o");
        assertTrue(tttBoard.currentPlayer() == "x");
    }
}
