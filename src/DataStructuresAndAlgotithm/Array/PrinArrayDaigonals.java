package DataStructuresAndAlgotithm.Array;
//print array daigonal wise
public class PrinArrayDaigonals {
    public static void main(String[] args) {
        int matrix[][]={
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        int n=matrix.length;
        System.out.println("printing matrix : ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();

        }
        System.out.print("\nPrimary Diagonal: ");
        System.out.println();
        for (int i = 0; i < n; i++) {

                    System.out.print(matrix[i][i]+" ");

        }
        System.out.println("\nSecondary Diagonal: ");
        for (int i = 0; i < n; i++) {

            System.out.print(matrix[i][n-i-1]+" ");

        }
    }
}
