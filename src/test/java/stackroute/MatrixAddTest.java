package stackroute;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class MatrixAddTest {
    private static MatrixAdd matrixAdd;
    @BeforeClass
    public static void setup(){
        matrixAdd=new MatrixAdd();
    }
    @AfterClass
    public static void teardown(){
        matrixAdd=null;
    }
    @Test
    public void testAddMatrix(){
        assertEquals("check the sum of matrix",new int[][] {{10,10},{10,10},{10,10}},matrixAdd.add(3,2,new int[][]{{1,2},{3,4},{5,6}},new int[][]{{9,8},{7,6},{5,4}}));
        //assertNotEquals("Check Grade","Not in the Range",studentGrade.grade(new int[]{90,91,89,59,78}));
        assertEquals("check the sum of matrix",new int[][] {{5,5},{5,5}},matrixAdd.add(2,2,new int[][]{{1,2},{3,4}},new int[][]{{4,3},{2,1}}));

        assertNotNull("Check the sum",matrixAdd.add(4,2,new int[][]{{1,2},{3,4},{45,6},{7,8}},new int[][]{{1,2},{3,4},{45,6},{7,8}}));

    }
}
