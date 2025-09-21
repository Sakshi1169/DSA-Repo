package DataStructuresAndAlgotithm.Binary_Search;
//leetcode 374

// Dummy GuessGame class (normally provided by LeetCode)
class GuessGame {
    private int pickedNumber = 42; // You can change this for testing

    // API method
    public int guess(int num) {
        if (num == pickedNumber) return 0;
        else if (num > pickedNumber) return -1;
        else return 1;
    }
}

// Solution class
 class Solution5 extends GuessGame {
    public int guessNumber(int n) {
        int start = 1;
        int end = n;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            int res = guess(mid);

            if (res == 0) {
                return mid;
            } else if (res == -1) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }
}

public class GuessNumber {
    public static void main(String[] args) {
        Solution5 solution = new Solution5();
        int n = 100; // range of numbers
        int result = solution.guessNumber(n);
        System.out.println("Picked number is: " + result);
    }

}
