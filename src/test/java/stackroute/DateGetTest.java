package stackroute;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DateGetTest {

    private static DateGet dateGet;
    @BeforeClass
    public static void setup(){
        dateGet=new DateGet();
    }
    @AfterClass
    public static void teardown(){
        dateGet=null;
    }
    @Test
    public void testGetDate() {

        assertEquals("FInd the date ",new String[]{"Mon 01/04/2019","Sun 07/04/2019"},dateGet.getdate());


    }
}
