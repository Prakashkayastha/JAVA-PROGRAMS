
public class Fourdigitvii {
    public static void main(String[] args) {
      
        
    
       
        int number1 = 1234;
        
       
        int number2 =4321;
        
        
        int sumOfDigits = 0;
        int temp = number1;
        int rem1,rem2,rem3,rem4;
        rem1=temp%10;
        temp /= 10;

        rem2=temp%10;
        temp /= 10;

        rem3=temp%10;
        temp /= 10;

        rem4=temp%10;
        sumOfDigits=rem1+rem2+rem3+rem4;

        int thirdDigit = (number2 / 100) % 10;
        
        int leftShiftResult = sumOfDigits << thirdDigit;
        int rightShiftResult = sumOfDigits >> thirdDigit;
        int zeroFillRightShiftResult = sumOfDigits >>> thirdDigit;
        
        System.out.println("Sum of digits: " + sumOfDigits);
        System.out.println("Left Shift: " + leftShiftResult);
        System.out.println("Right Shift: " + rightShiftResult);
        System.out.println("Zero-fill Right Shift: " + zeroFillRightShiftResult);
        
       
    }


}
