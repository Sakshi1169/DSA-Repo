package Leetcode.ArrayList;
import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {

    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> answer = new ArrayList<>();
        List<Integer> firstRow = new ArrayList<>();
        firstRow.add(1);
        answer.add(new ArrayList<>(firstRow));
        // answer = [[1],..........]

        // middle rows
        for (int i = 1; i < numRows; i++) {
            List<Integer> currentRow = new ArrayList<>();
            List<Integer> prevRow = answer.get(i - 1);

            currentRow.add(1); // first element
            for (int j = 1; j < i; j++) {
                int element = prevRow.get(j - 1) + prevRow.get(j);
                currentRow.add(element);
            }
            currentRow.add(1); // last element

            answer.add(new ArrayList<>(currentRow));
        }

        return answer;
    }

    public static void main(String[] args) {
        int numRows = 5; // Example: generate first 5 rows
        List<List<Integer>> result = generate(numRows);

        // Print Pascal's Triangle
        for (List<Integer> row : result) {
            System.out.println(row);
        }
    }
}
