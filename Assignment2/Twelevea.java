public class Twelevea{
    public static void main(String[] args) {
        
        if (args.length != 10) {
            System.out.println("Please provide exactly 10 numbers as command-line arguments.");
            return;
        }

     
        double greatest = Double.parseDouble(args[0]);
        double smallest = Double.parseDouble(args[0]);

       
        for (int i = 0; i < 10; i++) {
            try {
                double num = Double.parseDouble(args[i]);

                if (num > greatest) {
                    greatest = num;
                }

                if (num < smallest) {
                    smallest = num;
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please provide valid numbers.");
                return;
            }
        }

        double difference = greatest - smallest;

      
        System.out.println("Difference between greatest and smallest: " + difference);
    }
}
