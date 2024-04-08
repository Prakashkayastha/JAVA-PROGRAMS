
public class Fourdigitvi {
   
    public static void main(String[] args) {
        
        
        int number=1234;
        
        int secondDigit = (number / 10) % 10;
        int fourthDigit = number % 10;
        
      
        int bitwiseAnd = secondDigit & fourthDigit;
        int bitwiseOr = secondDigit | fourthDigit;
        int bitwiseXor = secondDigit ^ fourthDigit;
      
        System.out.println("Bitwise AND: " + bitwiseAnd);
        System.out.println("Bitwise OR: " + bitwiseOr);
        System.out.println("Bitwise XOR: " + bitwiseXor);
        
      
    }


}
