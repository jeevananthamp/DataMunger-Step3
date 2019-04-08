package stackroute;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class TryCatchTest {


    private static TryCatch tryCatch;
    @BeforeClass
    public static void setup(){
        tryCatch=new TryCatch();
    }
    @AfterClass
    public static void teardown(){
        tryCatch=null;
    }
    @Test
    public void testTryCatch() {

        assertEquals("check exception ","Catch this error",tryCatch.main("Catch this error"));
        assertNotEquals("check exception","Error",tryCatch.main("error"));


    }
}
