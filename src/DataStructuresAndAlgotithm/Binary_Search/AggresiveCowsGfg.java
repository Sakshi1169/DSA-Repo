package DataStructuresAndAlgotithm.Binary_Search;
import java.util.*;
//gfg --> aggresive cows -binary search on answer
class SolutionofAggresiveCow {

    private boolean isPossible(int stalls[], int k, int mid) {
        int count = 1; // first cow at first stall
        int last_position = stalls[0];

        for (int i = 1; i < stalls.length; i++) {
            if (stalls[i] - last_position >= mid) {
                count++;
                last_position = stalls[i];
            }
            if (count == k) {
                return true; // all cows placed
            }
        }
        return false;
    }

    public int aggressiveCows(int[] stalls, int k) {
        Arrays.sort(stalls);  // sort the array
        int low = 1; // minimum possible distance
        int high = stalls[stalls.length - 1] - stalls[0]; // maximum possible distance
        int answer = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (isPossible(stalls, k, mid)) {
                answer = mid;  // mid is possible, try for larger distance
                low = mid + 1;
            } else {
                high = mid - 1; // mid not possible, try smaller distance
            }
        }
        return answer;
    }
}

public class AggresiveCowsGfg {
    public static void main(String[] args) {
        SolutionofAggresiveCow sol = new SolutionofAggresiveCow();

        int[] stalls1 = {1, 2, 4, 8, 9};
        int k1 = 3;
        System.out.println(sol.aggressiveCows(stalls1, k1));  // Output: 3

        int[] stalls2 = {10, 1, 2, 7, 5};
        int k2 = 3;
        System.out.println(sol.aggressiveCows(stalls2, k2));  // Output: 4

        int[] stalls3 = {2, 12, 11, 3, 26, 7};
        int k3 = 5;
        System.out.println(sol.aggressiveCows(stalls3, k3));  // Output: 1
    }
}