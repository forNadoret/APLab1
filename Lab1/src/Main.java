import java.util.Scanner;

/**
 * Main class of the program to work with an array of Lucas numbers.
 * The program:
 * - Creates an array of LukeNumber objects
 * - Reads the index n from the keyboard for each element
 * - Checks that n is less than or equal 0
 * - Calculates the Lucas number for each object
 * - Prints the results to the console
 */
public class Main {

    /**
     * Main method of the program.
     * Creates an array of LukeNumber objects, reads n from the keyboard,
     * validates input, calculates Lucas numbers, and prints the results.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("This is a program to determine n-th Luke's number");

        LukeNumber[] array = new LukeNumber[5];

        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter N (<= 0) for element " + (i + 1) + ": ");
            int n = sc.nextInt();
            System.out.println();

            if (n > 0) {
                System.out.println("N must be <= 0. Try again");
                i--;
                continue;
            }

            array[i] = new LukeNumber(n);
        }

        System.out.println("Results: ");
        for (LukeNumber item : array) {
            System.out.println("N = " + item.getN() + ", Value: " + item.getValue());
        }
    }
}
