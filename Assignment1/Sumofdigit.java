
public class Sumofdigit {
    
    public static void main(String args[])
    {
      
      int number;
      System.out.println("Enter the four digit number:");
      number=1234;
      int sum=0;
      int temp=number;
      int rem1,rem2,rem3,rem4;
      rem1=temp%10;
      temp /= 10;

      rem2=temp%10;
      temp /= 10;

      rem3=temp%10;
      temp /= 10;

      rem4=temp%10;
      temp /= 10;
      sum=rem1+rem2+rem3+rem4;
      System.out.println("The sum of all digits is:"+sum);



    }
}
