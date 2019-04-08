package stackroute;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ChessBoardTest {
    private static ChessBoard chessBoard;
    @BeforeClass
    public static void setup(){
        chessBoard=new ChessBoard();
    }
    @AfterClass
    public static void teardown(){
        chessBoard=null;
    }
    @Test
    public void testChessBoard() {

        assertEquals("FInd the date ",new String[][]{{"WW|","BB|","WW|","BB|","WW|","BB|","WW|","BB|"},{"BB|","WW|","BB|","WW|","BB|","WW|","BB|","WW|"},{"WW|","BB|","WW|","BB|","WW|","BB|","WW|","BB|"},{"BB|","WW|","BB|","WW|","BB|","WW|","BB|","WW|"},{"WW|","BB|","WW|","BB|","WW|","BB|","WW|","BB|"},{"BB|","WW|","BB|","WW|","BB|","WW|","BB|","WW|"},{"WW|","BB|","WW|","BB|","WW|","BB|","WW|","BB|"},{"BB|","WW|","BB|","WW|","BB|","WW|","BB|","WW|"}},chessBoard.chessboard());


    }
}
