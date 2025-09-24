package DataStructuresAndAlgotithm.Binary_Search;
//leetcode 875
public class KokoEatingbanana {
    public int minEatingSpeed(int[] piles, int h) {
        int left = 1;
        int right = 0;

        // Find maximum pile size
        for (int pile : piles) {
            right = Math.max(right, pile);
        }

        int result = right; // max is considered as the result
        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (canEat(piles, h, mid)) {
                result = mid;
                right = mid - 1; // try smaller speed
            } else {
                left = mid + 1;  // need more speed
            }
        }

        return result;
    }

    private boolean canEat(int[] piles, int h, int k) {
        long hours = 0;
        for (int pile : piles) {
            // Equivalent to ceil(pile / k)
            hours += (pile + k - 1) / k;
        }
        return hours <= h;
    }

    // ----------------- MAIN METHOD -----------------
    public static void main(String[] args) {
        KokoEatingbanana obj = new KokoEatingbanana();

        int[] piles = {3, 6, 7, 11};
        int h = 8;

        int result = obj.minEatingSpeed(piles, h);
        System.out.println("Minimum eating speed: " + result);

    }
}
