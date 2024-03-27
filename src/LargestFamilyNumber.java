import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class LargestFamilyNumber {

    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("This program takes a non negative integer n, and returns the largest number of its family.");
            System.out.println("");
            System.out.print("Enter a non-negative integer: ");
            String input = reader.readLine();
            System.out.println("");
            String sortedDescending = sortDigitsDescending(input);
            int largestSibling = Integer.parseInt(sortedDescending);
            System.out.println("The largest number in the family is: " + largestSibling);
            System.out.println("");
        } catch (IOException e) {
            System.out.println("An error occurred while reading input.");
        }
    }

    private static String sortDigitsDescending(String number) {
        // Manually sort the digits in descending order
        char[] digits = number.toCharArray();
        for (int i = 0; i < digits.length; i++) {
            for (int j = i + 1; j < digits.length; j++) {
                if (digits[j] > digits[i]) {
                    // Swap i and j
                    char temp = digits[i];
                    digits[i] = digits[j];
                    digits[j] = temp;
                }
            }
        }
        return new String(digits);
    }
}
