package DataStructuresAndAlgotithm.Array;

// LeetCode 11: Container With Most Water
public class ContainerwithMostWater {

    // Function to calculate maximum area of water container
    public int maxArea(int[] height) {
        int left = 0;                       // Left pointer (start of array)
        int right = height.length - 1;      // Right pointer (end of array)
        int maxArea = 0;                    // Variable to store max area

        while (left < right) {
            // Find the height = smaller line between left & right
            int h = Math.min(height[left], height[right]);
            // Width = distance between two pointers
            int w = right - left;
            // Area = height * width
            int area = h * w;

            // Update maximum area if current area is bigger
            maxArea = Math.max(maxArea, area);

            // Move pointer: always move the smaller line inward
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return maxArea;
    }

    // Main method to test the function
    public static void main(String[] args) {
        ContainerwithMostWater obj = new ContainerwithMostWater();
        int[] height = {1,8,6,2,5,4,8,3,7};
        int result = obj.maxArea(height);
        System.out.println("Maximum water container area: " + result);
    }
}
