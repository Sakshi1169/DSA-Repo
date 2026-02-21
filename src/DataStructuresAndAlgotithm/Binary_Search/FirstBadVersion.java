package DataStructuresAndAlgotithm.Binary_Search;
//leetcode 278
// Simulating backend API
class VersionControl {

    // Suppose this is predefined bad version
    private int bad = 4;   // change this to test

    public boolean isBadVersion(int version) {
        return version >= bad;
    }
}
// Your solution class
public class FirstBadVersion extends VersionControl {

    public int firstBadVersion(int n) {

        int start = 1;
        int end = n;

        while (start < end) {

            int mid = start + (end - start) / 2;

            if (isBadVersion(mid)) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }

        return start;
    }

    // Main method to test
    public static void main(String[] args) {

        FirstBadVersion obj = new FirstBadVersion();

        int n = 5;
        int result = obj.firstBadVersion(n);

        System.out.println("First Bad Version is: " + result);
    }
}
