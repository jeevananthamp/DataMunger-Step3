package stackroute;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConsecutiveCheckTest {

    private static ConsecutiveCheck consecutiveCheck;
    @BeforeClass
    public static void setup(){
        consecutiveCheck=new ConsecutiveCheck();
    }
    @AfterClass
    public static void teardown(){
        consecutiveCheck=null;
    }
    @Test
    public void testGetDate() {

        assertEquals("check consecutive ","Are consecutive numbers",consecutiveCheck.checkConsecutive("54,53,52,51,50,49,48"));
        assertEquals("check consecutive ","Not Consecutive",consecutiveCheck.checkConsecutive("54,51,52,51,50,49,48"));


    }

}
