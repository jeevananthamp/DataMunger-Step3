package stackroute;

public class MatrixAdd {

public int[][] add(int row,int col,int mat1[][],int mat2[][])
{

    int sum[][] = new int[row][col];
    for (int c = 0; c < row; c++)
        for (int d = 0; d < col; d++)
            sum[c][d] = mat1[c][d] + mat2[c][d];
        return sum;
}
}
