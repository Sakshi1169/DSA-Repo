package Leetcode.Binary_Search;

//leetcode - 74
class Result {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length; // number of rows
        int n = matrix[0].length; // number of col

        // step-1 binary search on correct row (logn)
        int top = 0;
        int bottom = m - 1;
        int row = -1;
        while (top <= bottom) {
            int mid = top + (bottom - top) / 2;

            if (target >= matrix[mid][0] && target <= matrix[mid][n - 1]) {
                row = mid;
                break;
            } else if (target < matrix[mid][0]) {
                bottom = mid - 1;
            } else {
                top = mid + 1;
            }
        }
        if (row == -1)
            return false; // target not in any row

        // step-2 BS to find target (logm)
        int left = 0;
        int right = n - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (matrix[row][mid] == target) {
                return true;
            } else if (matrix[row][mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return false;
    }
}

public class Search_Matrix {
    public static void main(String[] args) {
        Result r = new Result();

        int[][] matrix = {
                {1, 3, 5, 7},
                {10, 11, 16, 20},
                {23, 30, 34, 50}
        };

        int target1 = 3;


        System.out.println("Searching " + target1 + " → " + r.searchMatrix(matrix, target1)); // true
    }
}
