class PrintEven implements Runnable {
    @Override
   public void run() {
        for (int i = 20; i <= 30; i += 2) {
            System.out.println("Even Thread: " + i);
        }
    }
}

class PrintOdd implements Runnable {
    @Override
    public void run() {
        for (int i = 31; i <= 40; i += 2) {
            System.out.println("Odd Thread: " + i);
        }
    }
}

public class Q7 {
    public static void main(String[] args) {
        // Creating instances of the Runnable classes
        PrintEven printEven = new PrintEven();
        PrintOdd printOdd = new PrintOdd();

        // Creating threads for the Runnable instances
        Thread evenThread = new Thread(printEven);
        Thread oddThread = new Thread(printOdd);

        // Starting the threads
        evenThread.start();
        oddThread.start();

        // Main thread logic to calculate and print the sum of even and odd numbers
        int evenSum = 0;
        for (int i = 20; i <= 30; i += 2) {
            evenSum += i;
        }

        int oddSum = 0;
        for (int i = 30; i <= 40; i += 2) {
            oddSum += i;
        }

        System.out.println("Main Thread - Sum of even numbers between 20 and 30: " + evenSum);
        System.out.println("Main Thread - Sum of odd numbers between 30 and 40: " + oddSum);
    }
}

