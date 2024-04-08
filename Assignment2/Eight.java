import  java.util.Scanner;

public class Eight {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the input from the user.
        System.out.print("Enter the starting number: ");
        double start = scanner.nextDouble();
        System.out.print("Enter the ending number: ");
        double end = scanner.nextDouble();

        // Find the LCM of all odd numbers in the given range.
        double lcm = 1;
        for (double i = start; i <= end; i++) {
            if (i % 2 == 1) {
                double gcd = 1;
                for (int j = 2; j <= i; j++) {
                    if (i % j == 0 && lcm % j == 0) {
                        gcd = j;
                    }
                }
                lcm = (lcm * i) / gcd;
            }
        }

        // Print the LCM of all odd numbers in the given range.
        System.out.println("The LCM of all odd numbers from " + start + " to " + end + " is: " + lcm);
    }
}