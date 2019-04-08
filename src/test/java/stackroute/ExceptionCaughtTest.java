package stackroute;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class ExceptionCaughtTest {


    private static ExceptionCaught exceptionCaught;
    @BeforeClass
    public static void setup(){
        exceptionCaught=new ExceptionCaught();
    }
    @AfterClass
    public static void teardown(){
        exceptionCaught=null;
    }
    @Test
    public void testNegativeException() {

        assertEquals("check exception ","java.lang.NegativeArraySizeException: -1",exceptionCaught.NegativeIndexSize(-1));
       assertNotEquals("check exception","Error",exceptionCaught.NegativeIndexSize(-9));

    }
    @Test
    public void testIndexOutException() {

        assertEquals("check exception ","java.lang.ArrayIndexOutOfBoundsException: Index 8 out of bounds for length 4",exceptionCaught.IndexOutBoundException(4));
        assertNotEquals("check exception","Error",exceptionCaught.IndexOutBoundException(3));

    }
    @Test
    public void testNullPointer() {
        int[] a=null;
        assertEquals("check exception ","java.lang.NullPointerException",exceptionCaught.NullPointerException(a));
        assertNotEquals("check exception","Error",exceptionCaught.NullPointerException(a));

    }
}
