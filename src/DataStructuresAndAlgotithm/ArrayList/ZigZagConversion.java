package DataStructuresAndAlgotithm.ArrayList;
import java.util.*;
public class ZigZagConversion {
    public String convert(String s, int numRows) {
        // edge case
        if (numRows == 1) {
            return s;
        }

        List<List<Character>> answer = new ArrayList<>();
        // create empty arraylist its like [ [],[],[] ]
        for (int i = 0; i < numRows; i++) {
            answer.add(new ArrayList<>());
        }

        // main logic
        int rowIndex = 0;
        boolean goingDown = true; // true → नीचे जाना, false → ऊपर जाना

        for (int i = 0; i < s.length(); i++) {
            answer.get(rowIndex).add(s.charAt(i));

            if (goingDown) {
                rowIndex++;
                if (rowIndex == numRows) {
                    rowIndex = numRows - 2;
                    goingDown = false;
                }
            } else {
                rowIndex--;
                if (rowIndex < 0) {
                    rowIndex = 1;
                    goingDown = true;
                }
            }
        }

        // join all rows
        StringBuilder ans = new StringBuilder();
        for (List<Character> row : answer) {
            for (char c : row) {
                ans.append(c);
            }
        }

        return ans.toString();
    }

    public static void main(String[] args) {
        ZigZagConversion sol = new ZigZagConversion();
        String input = "PAYPALISHIRING";
        int numRows = 3;

        String result = sol.convert(input, numRows);
        System.out.println("Converted Zigzag: " + result);
    }
}
