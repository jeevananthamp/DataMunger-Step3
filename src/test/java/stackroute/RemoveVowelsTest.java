package stackroute;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RemoveVowelsTest {
    private static RemoveVowels removeVowels;
    @BeforeClass
    public static void setup(){
        removeVowels=new RemoveVowels();
    }
    @AfterClass
    public static void teardown(){
        removeVowels=null;
    }
    @Test
    public void testRemoveVowels(){
        assertEquals("Remove the Vowels ",new String[]{"Ind","Untd stts","Grmny","Egypt"},removeVowels.vowelsremove(new String[]{"India","United states","Germany","Egypt"}));
    }
}
