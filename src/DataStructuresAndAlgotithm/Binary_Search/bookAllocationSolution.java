package DataStructuresAndAlgotithm.Binary_Search;
//gfg
public class bookAllocationSolution {
    public boolean canAlloctesPages(int[] arr, int k, int pages) {
        int cnt = 1;
        int sum = 0;

        for(int x : arr) {
            if(sum + x <= pages) {
                sum += x;
            } else {
                cnt++;
                sum = x;
            }
        }

        return cnt <= k;
    }

    public int findPages(int[] arr, int k) {
        if(k > arr.length) return -1;

        int low = 0;
        int high = 0;

        for(int a : arr) {
            low = Math.max(low, a);
            high += a;
        }

        int ans = -1;

        while(low <= high) {
            int mid = low + (high - low) / 2;

            if(canAlloctesPages(arr, k, mid)) {
                ans = mid;
                high = mid - 1;   // move left (minimum problem)
            } else {
                low = mid + 1;
            }
        }

        return ans;
    }

}
/*
Problem Statement – Allocate Books

Given:

An array arr[] where arr[i] = pages in i-th book

k students

Conditions:

Each student gets at least one book

Books must be allocated in continuous order

Minimize the maximum number of pages assigned to a student

Return the minimum possible maximum pages.


Time Complexity

Binary Search → O(log(sum - max))

isPossible check → O(n)
Overall:
O(n log(sum))
 */
