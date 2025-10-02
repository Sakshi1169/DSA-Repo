package DataStructuresAndAlgotithm.Math;
//leetcode 3100
public class numWaterBottles2 {

    public int maxBottlesDrunk(int numBottles, int numExchange) {
        int totalDrunk = numBottles;
        int empty = numBottles;

        while (empty >= numExchange) {
            empty = empty - numExchange;  // give empty bottles
            numExchange++;                // cost increases
            totalDrunk++;                 // one new bottle drunk
            empty++;                      // that new bottle becomes empty
        }
        return totalDrunk;
    }

    public static void main(String[] args) {
        numWaterBottles2 solution = new numWaterBottles2();

        // Example test cases
        int result1 = solution.maxBottlesDrunk(13, 6);
        System.out.println("Max bottles drunk (13, 6): " + result1);

        int result2 = solution.maxBottlesDrunk(10, 3);
        System.out.println("Max bottles drunk (10, 3): " + result2);

        int result3 = solution.maxBottlesDrunk(5, 5);
        System.out.println("Max bottles drunk (5, 5): " + result3);
    }
}
