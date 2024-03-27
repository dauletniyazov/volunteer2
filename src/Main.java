import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {

    public static String generatePattern(int n) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                result.append("+");
            } else {
                result.append("-");
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.printf("The program asks for an integer value as a parameter but will return " +
                "a String of length the given n, containing only characters: '+' and '-'. %n");

        System.out.println("");

        try {
            System.out.print("Enter a number: ");
            int n = Integer.parseInt(reader.readLine()); // Read and convert the input to an integer
            System.out.println(generatePattern(n)); // Output the generated pattern
        } catch (IOException e) {
            System.out.println("An I/O error occurred.");
        } catch (NumberFormatException e) {
            System.out.println("Please enter a valid number.");
        }
    }
}
