import java.util.Scanner;

public class FindyourNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int low = 0, high = n - 1;
        int guess = 0, numGuesses = 0;

        System.out.print("Think of a number between 0 and " + (n - 1) + " inclusive.\n");
        while (low <= high) {
            guess = (low + high) / 2;
            System.out.print("Is your number between " + low + " and " + guess + "? ");
            boolean response = scanner.nextBoolean();
            numGuesses++;

            if (response) {
                high = guess - 1;
            } else {
                low = guess + 1;
            }
        }
        System.out.println("Your number is " + guess + ".");
        System.out.println("Number of guesses: " + numGuesses);
    }

}
