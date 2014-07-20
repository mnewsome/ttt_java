package com.ttt;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TTTBoardTest {
    private TTTBoard tttBoard;
    private String X_MARK = "x";
    private String O_MARK = "o";

    @Before
    public void initTTTBoard() {
       tttBoard = new TTTBoard(9);
    }

    @Test
    public void testCurrentPlayer() {
        tttBoard.fillSpaceAt(1, X_MARK);
        assertTrue(tttBoard.currentPlayer() == O_MARK);

        tttBoard.fillSpaceAt(2, O_MARK);
        assertTrue(tttBoard.currentPlayer() == X_MARK);
    }
}
