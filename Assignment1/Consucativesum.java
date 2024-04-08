
public class Consucativesum {
     public static void main(String args[])
     {
      
      int number=1234;
      int temp=number;
      int rem1,rem2,rem3,rem4,sum=0;
      rem1=temp%10;
      temp /= 10;

      rem2=temp%10;
      temp /= 10;

      rem3=temp%10;
      temp /= 10;

      rem4=temp%10;
      temp /= 10;
      sum = (rem1*rem2) +(rem2*rem3) + (rem3*rem4);
      System.out.println("Sum="+sum);
     }
}
