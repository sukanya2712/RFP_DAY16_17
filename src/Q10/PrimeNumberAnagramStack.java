package Q10;

import java.util.Arrays;

public class PrimeNumberAnagramStack {
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
        // Initialize the linked list and stack
        Node head = null;
        Node tail = null;
        Node temp = null;

        // Loop through the range of numbers and check for primes and anagrams
        for (int i = 0; i <= 1000; i++) {
            if (isPrime(i)) {
                for (int j = i + 1; j <= 1000; j++) {
                    if (isPrime(j) && areAnagrams(i, j)) {
                        // Add the anagram prime to the linked list
                        Node newNode = new Node(j);
                        if (head == null) {
                            head = newNode;
                            tail = newNode;
                        } else {
                            tail.next = newNode;
                            tail = newNode;
                        }
                    }
                }
            }
        }

        // Print the anagrams in reverse order using a stack
        Node current = head;
        while (current != null) {
            Node newNode = new Node(current.data);
            if (temp == null) {
                temp = newNode;
            } else {
                newNode.next = temp;
                temp = newNode;
            }
            current = current.next;
        }

        // Pop the anagrams from the stack and print them in reverse order
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}
