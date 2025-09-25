//leetcode -1011 O(log(n))
package DataStructuresAndAlgotithm.Binary_Search;

public class ShipWithinDays {
    public int shipWithinDays(int[] weights, int days) {
        int max = 0;
        int sum = 0;
        // step 1 →
        for (int weight : weights) {
            max = Math.max(max, weight);
            sum += weight;
        }

        int left = max, right = sum;
        int result = sum;

        // step 2 → binary search
        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (canShip(weights, days, mid)) {
                result = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return result;
    }

    // helper method →
    private boolean canShip(int[] weights, int days, int capacity) {
        int day = 1;
        int currWeight = 0;
        for (int weight : weights) {
            if (currWeight + weight > capacity) {
                day++;
                currWeight = weight;

                if (day > days) return false;
            } else {
                currWeight += weight;
            }
        }
        return true;
    }

    // main method → test
    public static void main(String[] args) {
        ShipWithinDays obj = new ShipWithinDays();

        int[] weights1 = {1, 2, 3, 4, 5};
        int days1 = 3;
        System.out.println("Output 1: " + obj.shipWithinDays(weights1, days1)); // 6

        int[] weights2 = {1,2,3,4,5,6,7,8,9,10};
        int days2 = 5;
        System.out.println("Output 2: " + obj.shipWithinDays(weights2, days2)); // 15

        int[] weights3 = {3,2,2,4,1,4};
        int days3 = 3;
        System.out.println("Output 3: " + obj.shipWithinDays(weights3, days3)); // 6

        int[] weights4 = {1,2,3,1,1};
        int days4 = 4;
        System.out.println("Output 4: " + obj.shipWithinDays(weights4, days4)); // 3
    }
}
