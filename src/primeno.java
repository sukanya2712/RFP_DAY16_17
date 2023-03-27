import java.util.ArrayList;
import java.util.Arrays;

public class primeno {

    // Method to check if a number is prime
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Method to check if two numbers are anagrams
    public static boolean areAnagrams(int n1, int n2) {
        char[] arr1 = Integer.toString(n1).toCharArray();
        char[] arr2 = Integer.toString(n2).toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        return Arrays.equals(arr1, arr2);
    }

    public static void main(String[] args) {
        // Initialize the 2D array to store prime numbers and their anagrams
        ArrayList<Integer>[] primes = new ArrayList[10];
        ArrayList<Integer>[] anagrams = new ArrayList[10];
        for (int i = 0; i < 10; i++) {
            primes[i] = new ArrayList<Integer>();
            anagrams[i] = new ArrayList<Integer>();
        }

        // Loop through the range of numbers and check for primes and anagrams
        for (int i = 0; i <= 1000; i++) {
            if (isPrime(i)) {
                int index = i / 100; // determine which range the prime number belongs to
                primes[index].add(i);

                for (int j = i+1; j <= 1000; j++) {
                    if (isPrime(j) && areAnagrams(i, j)) {
                        anagrams[index].add(i);
                        anagrams[index].add(j);
                    }
                }
            }
        }

        // Print the results
        for (int i = 0; i < 10; i++) {
            System.out.println("Range " + (i*100) + " to " + ((i+1)*100) + ":");
            System.out.println("Primes: " + primes[i].toString());
            System.out.println("Anagrams: " + anagrams[i].toString());
            System.out.println("Non-anagrams: " + primes[i].removeAll(anagrams[i]));
            System.out.println();
        }
    }
}

