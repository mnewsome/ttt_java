package com.ttt;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TestBoard {

    private Board board;

    @Before
    public void initBoard() {
        board = new Board(3);
    }

    @Test
    public void testInitBoard() {
        assertNotNull(board);
    }

    @Test
    public void boardCanBeCreatedWithDifferentSizes() {
        String[] testSpaces = new String[9];
        assertTrue(testSpaces.length == board.spaces().length);

        String[] testSpaces2 = new String[16];
        Board board2 = new Board(4);
        assertTrue(testSpaces2.length == board2.spaces().length);
    }

    @Test
    public void testSpacesCanBeFilled() {
        board.fillSpaceAt(1, "something");

        assertTrue(board.spaces()[0] == "something");
    }

    @Test
    public void  testEmptySpace() {
        assertTrue(board.isSpaceEmpty(1));
    }

    @Test
    public void testSpaceCanBeReset() {
        board.fillSpaceAt(1, "BOOYA");
        board.resetSpaceAt(1);

        assertTrue(board.spaces()[0] == "");
    }
}