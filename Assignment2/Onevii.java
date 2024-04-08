
import java.util.Scanner;
public class Onevii {
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int number;
        System.out.println("Enter the number:");
        number =sc.nextInt();
        int temp=number;
        int sum=0,rem1=0;
        while(temp>0)
        {
            int rem2=temp%10;
            sum += rem1*rem2;
            temp /= 10;
            rem1=rem2;
        }
        System.out.println(sum);

   }
}
