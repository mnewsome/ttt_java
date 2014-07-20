package com.ttt;

import java.util.Arrays;

public class Board {

    private String[] spaces;
    private static final String  EMPTY_SPACE = "";

    public Board(int size) {
        int numberOfSpaces = size*size;
        this.spaces = new String[numberOfSpaces];
        Arrays.fill(this.spaces, EMPTY_SPACE);
    }

    public String[] spaces() {
        return spaces;
    }

    public void fillSpaceAt(int move, String playerMark) {
        spaces[move - 1] = playerMark;
    }

    protected int blankSpaceCount() {
        int openSpaces = 0;

        for(int i = 0; i < this.spaces.length; i++) {
            if (this.spaces[i].equals(EMPTY_SPACE)){
                openSpaces += 1;
            }
        }
        return openSpaces;
    }

    public boolean isSpaceEmpty(int move){
        if (this.spaces[move -1].equals(EMPTY_SPACE)){
            return true;
        } else {
            return false;
        }
    }

    public void resetSpaceAt(int spaceNumber) {
        spaces[spaceNumber - 1] = EMPTY_SPACE;
    }
}
