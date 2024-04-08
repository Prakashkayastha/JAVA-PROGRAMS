import java.util.Scanner;

public class Five {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

   
        System.out.print("Enter a number (x): ");
        int x = scanner.nextInt();


        System.out.print("Enter another number (n): ");
        int n = scanner.nextInt();

        scanner.close();

        x = calculateX(x);
        n = calculateN(n);

       
        double result = calculateSeries(x, n);

        System.out.println("Result of the series: " + result);
    }

    public static int calculateX(int num) {
        int sum = 0;
        while (num > 0) {
            int digit = num % 10;
            if (digit % 2 == 0 && digit != 2 && digit != 8) {
                sum += digit;
            }
            num /= 10;
        }
        return sum;
    }

    public static int calculateN(int num) {
        int sum = 0;
        while (num > 0) {
            int digit = num % 10;
            if (digit % 2 != 0 && digit != 1 && digit != 3) {
                sum += digit;
            }
            num /= 10;
        }
        return sum;
    }

    public static double calculateSeries(int x, int n) {
        double result = 0;
        int sign = 1;
        int factorial = 1;

        for (int i = 1; i <= n; i += 2) {
            result += (double) sign * Math.pow(x, i) / factorial;
            sign *= -1; 
            factorial *= (i + 1) * (i + 2);
        }

        return result;
    }
}

