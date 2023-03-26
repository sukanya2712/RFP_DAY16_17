package Q11;

import java.util.Arrays;

public class PrimeNumberAnagramQueueMain {

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
        // Initialize the linked list and queue
        PrimeNumberAnagramQueue<Integer> linkedlist2 = new PrimeNumberAnagramQueue<>();


        // Loop through the range of numbers and check for primes and anagrams
        for (int i = 0; i <= 1000; i++) {
            if (isPrime(i)) {
                for (int j = i + 1; j <= 1000; j++) {
                    if (isPrime(j) && areAnagrams(i, j)) {
                        // Add the anagram prime to the linked list
                        linkedlist2.add(j);
                    }
                }
            }
        }

        // Print the anagrams from the queue
        linkedlist2.queueprint();
    }
}
