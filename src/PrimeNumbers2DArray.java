

public class PrimeNumbers2DArray {
    public static void main(String[] args) {
        // Step 1: Initialize a 2D array to store the prime numbers
        int[][] primeNumbers = new int[10][];

        // Step 2: Loop through each range of 100 numbers
        int start = 0;
        int end = 100;
        for (int i = 0; i < 10; i++) {
            // Step 3: Call a method to get the prime numbers in the current range
            primeNumbers[i] = getPrimesInRange(start, end);

            // Step 4: Update the start and end values for the next range
            start = end + 1;
            end += 100;
        }

        // Step 5: Print out the prime numbers in each range
        for (int i = 0; i < 10; i++) {
            System.out.print("Primes between " + ((i * 100) + 1) + " and " + ((i + 1) * 100) + ": ");
            for (int j = 0; j < primeNumbers[i].length; j++) {
                System.out.print(primeNumbers[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Method to get the prime numbers in a given range
    public static int[] getPrimesInRange(int start, int end) {
        // Step 1: Create an array to store the prime numbers
        int[] primes = new int[end - start + 1];
        int index = 0;

        // Step 2: Loop through each number in the range
        for (int i = start; i <= end; i++) {
            // Step 3: Check if the current number is prime
            if (isPrime(i)) {
                // Step 4: If the number is prime, add it to the array of prime numbers
                primes[index] = i;
                index++;
            }
        }

        // Step 5: Create a new array with the correct size to store only the prime numbers
        int[] result = new int[index];

        // Step 6: Copy the prime numbers from the original array to the new array
        for (int i = 0; i < index; i++) {
            result[i] = primes[i];
        }

        // Step 7: Return the array of prime numbers
        return result;
    }

    // Method to check if a number is prime
    public static boolean isPrime(int n) {
        // Step 1: Check if the number is less than 2
        if (n < 2) {
            return false;
        }

        // Step 2: Loop through each number from 2 to the square root of the number
        for (int i = 2; i <= Math.sqrt(n); i++) {
            // Step 3: Check if the number is divisible by any of these numbers
            if (n % i == 0) {
                // Step 4: If the number is divisible, it is not prime
                return false;
            }
        }

        // Step 5: If the number is not divisible by any number from 2 to the square root of the number, it is prime
        return true;
    }
}

