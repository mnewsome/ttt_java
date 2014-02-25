package com.ttt;

import java.util.Arrays;

public class Board {

    private String[] spaces;
    public static final String PLAYER_ONE = "x";
    public static final String PLAYER_TWO = "o";
    

    public Board() {
        this.spaces = new String[9];
        Arrays.fill(this.spaces, "");
    }

    public String[] spaces() {
        return spaces;
    }

    public void fillSpaceAt(int move) {
        spaces[move - 1] = currentPlayer();
    }

    public String currentPlayer() {
        int blankSpaceCount = blankSpaceCount();

        if (blankSpaceCount % 2 == 0) {
            return PLAYER_TWO;
        } else {
            return PLAYER_ONE;
        }
    }

    private int blankSpaceCount() {
        int openSpaces = 0;

        for(int i = 0; i < this.spaces.length; i++) {
            if (this.spaces[i].equals("")){
                openSpaces += 1;
            }
        }
        return openSpaces;
    }

    public boolean isSpaceEmpty(int move){
        if (this.spaces[move -1].equals("")){
            return true;
        } else {
            return false;
        }
    }
}
