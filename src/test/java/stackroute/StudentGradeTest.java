package stackroute;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class StudentGradeTest {
    private static StudentGrade studentGrade;
    @BeforeClass
    public static void setup(){
        studentGrade=new StudentGrade();
    }
    @AfterClass
    public static void teardown(){
        studentGrade=null;
    }
    @Test
    public void testGrade(){
        assertEquals("check the grade","It is in the Range between 0 to 100",studentGrade.grade(new int[]{86,65,98,77}));
        assertNotEquals("Check Grade","Not in the Range",studentGrade.grade(new int[]{90,91,89,59,78}));
        assertNotNull("Check the grade",studentGrade.grade(new int[]{1,2,3,4,45,6,7,8,9}));

    }
    @Test
    public void testGradeFailiure(){
        assertEquals("check the grade","Not in the Range",studentGrade.grade(new int[]{86,65,198,77}));
        assertNotEquals("Check Grade","It is in the Range between 0 to 100",studentGrade.grade(new int[]{90,91,189,59,78}));
        assertNotNull("Check the grade",studentGrade.grade(new int[]{111,2,3,4,45,6,7,8,9}));

    }
}
