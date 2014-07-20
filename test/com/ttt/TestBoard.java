package com.ttt;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class TestBoard {

    public static final String X_MARK = "x";
    public static final String O_MARK = "o";
    private Board board;

    @Before
    public void initBoard() {
        board = new Board(9);
    }

    @Test
    public void testInitBoard() {
        assertNotNull(board);
    }

    @Test
    public void testSpaces() {
        String[] testSpaces = new String[9];
        Arrays.fill(testSpaces, "");
        assertArrayEquals(testSpaces, board.spaces());
    }

    @Test
    public void testCanFillSpaces() {
        board.fillSpaceAt(1, X_MARK);

        assertTrue(board.spaces()[0] == "x");
    }

    @Test
    public void  testEmptySpace() {
        assertTrue(board.isSpaceEmpty(1));
    }

    @Test
    public void testSpaceCanBeReset() {
        board.fillSpaceAt(1, X_MARK);

        board.resetSpaceAt(1);

        assertTrue(board.spaces()[0] == "" );
    }
}