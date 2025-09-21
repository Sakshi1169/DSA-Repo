package DataStructuresAndAlgotithm.Binary_Search;

import java.util.Scanner;

// Class name Answer (capitalized)
class Answer1 {

    // Check if it's possible to paint all boards with max time = mid
    public boolean isPossible(long mid, int[] arr, int k, int n) {
        int count = 1; // painters used
        long time = 0; // current painter's time

        for (int i = 0; i < n; i++) {
            if (time + arr[i] > mid) {  // need new painter
                count++;
                time = arr[i];
            } else {
                time += arr[i];
            }
        }

        return (count <= k);
    }

    // Binary search to find minimum maximum time
    public int minTime(int[] arr, int k) {
        int n = arr.length;
        long sum = 0;
        long maxValue = 0;

        for (int i = 0; i < n; i++) {
            sum += arr[i];
            maxValue = Math.max(arr[i], maxValue);
        }

        long start = maxValue;
        long end = sum;
        long answer = end;

        while (start <= end) {
            long mid = start + (end - start) / 2;
            if (isPossible(mid, arr, k, n)) {
                answer = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return (int) answer;
    }
}

public class PaintersPartition2Gfg{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of boards:");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter lengths of boards:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter number of painters:");
        int k = sc.nextInt();

        // Use correct class name
        Answer1 sol = new Answer1();
        int result = sol.minTime(arr, k);

        System.out.println("Minimum time to paint all boards: " + result);

        sc.close();
    }
}
