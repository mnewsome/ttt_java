import com.ttt.Board;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class TestBoard {

    private Board board;
    private String[] testSpaces;
    public static final String PLAYER_ONE = "x";
    public static final String PLAYER_TWO = "o";

    @Before
    public void initBoard() {
        board = new Board();
        testSpaces = new String[9];
        Arrays.fill(testSpaces, "");
    }
    @Test
    public void testInitBoard() {
        assertNotNull(board);
    }

    @Test
    public void testSpaces() {
        assertArrayEquals(testSpaces, board.spaces());
    }

    @Test
    public void testCanFillFirstSpace() {
        testSpaces[0] = PLAYER_ONE;
        board.fillSpaceAt(1);

        assertArrayEquals(testSpaces, board.spaces());
    }

    @Test
    public void testCurrentPlayer() {
        board.fillSpaceAt(1);
        board.fillSpaceAt(2);
        String testCurrentPlayer = PLAYER_ONE;

        assertEquals(testCurrentPlayer, board.currentPlayer());
    }

    @Test
    public void testCurrenPlayerIsO() {
        board.fillSpaceAt(1);
        board.fillSpaceAt(2);
        board.fillSpaceAt(3);
        String testCurrentPlayer = PLAYER_TWO;

        assertEquals(testCurrentPlayer, board.currentPlayer());
    }

    @Test
    public void  testEmptySpace() {
        assertTrue(board.isSpaceEmpty(1));
    }





}
