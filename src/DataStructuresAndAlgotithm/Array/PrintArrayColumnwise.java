package DataStructuresAndAlgotithm.Array;
//column wise matrix printing
/*
just exchange loop and print like normal arrya printing
 */
public class PrintArrayColumnwise {
    public static void main(String[] args) {
        int matrix[][]={
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        int rows=matrix.length;
        int cols=matrix[0].length;
        for(int j=0;j<cols;j++)
        {
            for (int i = 0; i <rows; i++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}
