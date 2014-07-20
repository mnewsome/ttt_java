package com.ttt;

public class TTTBoard extends Board {

    public static final String X_MARK = "x";
    public static final String O_MARK = "o";

    public TTTBoard(int numberOfSpaces) {
        super(numberOfSpaces);
    }

    public String currentPlayer() {
        int blankSpaceCount = blankSpaceCount();

        if (blankSpaceCount % 2 == 0) {
            return O_MARK;
        } else {
            return X_MARK;
        }
    }
}
