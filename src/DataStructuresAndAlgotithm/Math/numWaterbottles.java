package DataStructuresAndAlgotithm.Math;

// leetcode 1518
public class numWaterbottles {

    public int numWaterBottles(int numBottles, int numExchange) {
        int total = numBottles;
        int empty = numBottles;

        while (empty >= numExchange) {
            int newBottle = empty / numExchange;
            total += newBottle;
            empty = empty % numExchange + newBottle;
        }
        return total;
    }

    // Main method for testing
    public static void main(String[] args) {
        numWaterbottles solution = new numWaterbottles();

        int ans1 = solution.numWaterBottles(9, 3);
        System.out.println(  ans1); // Output: 13


    }
}
