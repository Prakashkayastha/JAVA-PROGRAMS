
import java.util.Scanner;
public class Oneix {
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
            if(rem1%2 !=0 && rem2%2 != 0)
            sum += rem1*rem2;
            temp /= 10;
            rem1=rem2;
        }
        if(sum == 0)
        System.out.println("Given number don't have any consucative odd integer");
        else 
        System.out.println("Result="+sum);

   }
}
