package DataStructuresAndAlgotithm.Binary_Search;
//leetcode - 69
//binary search --Time complexity O(logn)
class Solutionclass {
    public int mySqrt(int x) {
        long start = 0;
        long end = x;
        long answer = 0;

        while (start <= end) {
            long mid = (start + end) / 2;

            if (mid * mid <= x) {
                answer = Math.max(mid, answer);
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return (int) answer;
    }
}

public class sqrtofX {
    public static void main(String[] args) {
        Solutionclass sol = new Solutionclass();

        int x = 8; // single input
        int result = sol.mySqrt(x);

        System.out.println("Square root of " + x + " = " + result);
    }
}
