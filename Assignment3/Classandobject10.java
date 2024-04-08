package Assignment3;

import java.util.LinkedList;
import java.util.Queue;

// Interface definition
interface QueueOperations {
    void insert(int element);
    void delete();
    void replaceEvenWithNearestPrime();
    void displayOddAndPrimeCount();
}

// Class definition
class CustomQueue implements QueueOperations {
    private Queue<Integer> queue;
    private static final int QUEUE_SIZE = 10;

    // Constructor to create a queue of size 10 using LinkedList
    public CustomQueue() {
        queue = new LinkedList<>();
    }

    // Insert method to insert elements into the queue
    @Override
    public void insert(int element) {
        if (queue.size() < QUEUE_SIZE) {
            queue.add(element);
            System.out.println("Inserted element: " + element);
        } else {
            System.out.println("Queue is full. Cannot insert element: " + element);
        }
    }

    // Delete method to delete elements from the front of the queue
    @Override
    public void delete() {
        if (!queue.isEmpty()) {
            int deletedElement = queue.poll();
            System.out.println("Deleted element: " + deletedElement);
        } else {
            System.out.println("Queue is empty. Cannot delete element.");
        }
    }

    // Replace even numbers with nearest prime numbers
    @Override
    public void replaceEvenWithNearestPrime() {
        Queue<Integer> tempQueue = new LinkedList<>();

        while (!queue.isEmpty()) {
            int currentElement = queue.poll();

            if (currentElement % 2 == 0) {
                int nearestPrime = findNearestPrime(currentElement);
                tempQueue.add(nearestPrime);
            } else {
                tempQueue.add(currentElement);
            }
        }

        queue.addAll(tempQueue);
        System.out.println("Even numbers replaced with nearest prime numbers.");
    }

    // Display the count of odd and prime numbers in the queue
    @Override
    public void displayOddAndPrimeCount() {
        int oddCount = 0;
        int primeCount = 0;

        for (int element : queue) {
            if (element % 2 != 0) {
                oddCount++;
            }

            if (isPrime(element)) {
                primeCount++;
            }
        }

        System.out.println("Number of odd numbers: " + oddCount);
        System.out.println("Number of prime numbers: " + primeCount);
    }

    // Helper method to check if a number is prime
    private boolean isPrime(int n) {
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

    // Helper method to find the nearest prime number for an even number
    private int findNearestPrime(int evenNumber) {
        int lower = evenNumber - 1;
        int upper = evenNumber + 1;

        while (true) {
            if (isPrime(lower)) {
                return lower;
            } else if (isPrime(upper)) {
                return upper;
            }
            lower--;
            upper++;
        }
    }

    // Display the remaining elements of the queue
    public void displayRemainingElements() {
        System.out.println("Remaining elements in the queue:");
        for (int element : queue) {
            System.out.println(element);
        }
    }
}

// Main class
public class Classandobject10 {
    public static void main(String[] args) {
        // Creating an object of CustomQueue class
        CustomQueue customQueue = new CustomQueue();

        // Inserting 10 elements into the queue using insert method
        for (int i = 1; i <= 10; i++) {
            customQueue.insert(i * 5);
        }

        // Replacing even numbers with nearest prime numbers
        customQueue.replaceEvenWithNearestPrime();

        // Displaying the count of odd and prime numbers
        customQueue.displayOddAndPrimeCount();

        // Deleting 3 elements from the queue using delete method
        for (int i = 0; i < 3; i++) {
            customQueue.delete();
        }

        // Displaying the remaining elements of the queue
        customQueue.displayRemainingElements();
    }
}
