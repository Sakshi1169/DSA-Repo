package Leetcode.Binary_Search;
//leetcode 240 --> StairCase Search
class solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        int i = 0;
        int j = n - 1;

        while (i < m && j >= 0) {
            if (matrix[i][j] == target) {
                return true;
            } else if (matrix[i][j] < target) {
                i++;
            } else {
                j--;
            }
        }
        return false;
    }
}

public class Search2DMatrix {
    public static void main(String[] args) {
        solution sol = new solution();

        int[][] matrix = {
                {1, 3, 5, 7},
                {10, 11, 16, 20},
                {23, 30, 34, 50}
        };

        int target1 = 3;
        System.out.println("Searching for " + target1 + ": " + sol.searchMatrix(matrix, target1));
    }
}
