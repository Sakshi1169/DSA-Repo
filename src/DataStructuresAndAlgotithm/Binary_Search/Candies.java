package DataStructuresAndAlgotithm.Binary_Search;
//leetcode 2226 Maximum Candies Allocated to Children

/* time complexity
O(n⋅log(max(candies)))
  */
import java.util.Scanner;

public class Candies {

    public int maximumCandies(int[] candies, long k) {
        int left = 1;
        int right = 0;

        for (int candy : candies) {
            right = Math.max(right, candy);
        }

        int result = 0;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (canDistribute(candies, k, mid)) {
                result = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return result;
    }

    private boolean canDistribute(int[] candies, long k, int size) {
        long count = 0;
        for (int candy : candies) {
            count += candy / size;
        }
        return count >= k;
    }

    // main method for testing
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of candy piles: ");
        int n = sc.nextInt();

        int[] candies = new int[n];
        System.out.println("Enter candies in each pile:");
        for (int i = 0; i < n; i++) {
            candies[i] = sc.nextInt();
        }

        System.out.print("Enter number of children (k): ");
        long k = sc.nextLong();

        Candies solution = new Candies();
        int maxCandies = solution.maximumCandies(candies, k);

        System.out.println("Maximum candies each child can get: " + maxCandies);


    }
}
