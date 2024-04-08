public class Tweleveb {
    public static void main(String[] args) {
       
        if (args.length != 10) {
            System.out.println("Please provide exactly 10 numbers as command-line arguments.");
            return;
        }

       
        double sumOdd = 0;
        double sumEven = 0;
        int countOdd = 0;
        int countEven = 0;

    
        for (int i = 0; i < 10; i++) {
            try {
                double num = Double.parseDouble(args[i]);

                if (num % 2 == 0) {
                    // Even number
                    sumEven += num;
                    countEven++;
                } else {
                    // Odd number
                    sumOdd += num;
                    countOdd++;
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please provide valid numbers.");
                return;
            }
        }

   
        double averageOdd = countOdd == 0 ? 0 : sumOdd / countOdd;
        double averageEven = countEven == 0 ? 0 : sumEven / countEven;

        double difference = averageOdd - averageEven;

       
        System.out.println("Difference between average of odd and even numbers: " + difference);
    }
}

