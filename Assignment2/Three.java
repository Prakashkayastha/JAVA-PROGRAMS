import java.util.Scanner;
public class Three {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int num1,num2,digit=0,sum1=0,sum2=0;
        System.out.println("Enter the 1st number:");
        num1=sc.nextInt();
        System.out.println("Enter the 2nd number:");
        num2=sc.nextInt();
        int temp=num1;
        while(temp>0)
        {
            digit++;
            temp /= 10;
        }
        int temp1=num1;
        int temp2=num2;
        int count=0;
        while(digit > 0)
        {
           count++;
           int rem1=temp1%10;
           int rem2=temp2%10;
           if(count % 2 != 0)
           sum1 += rem1*rem2;
           else 
           sum2 += rem1*rem2;
           digit--;
           temp1 /= 10;
           temp2 /= 10;

        }
        System.out.println("Corresponding even digit sum="+sum1);
        System.out.println("Corresponding odd digit sum="+sum2);


    }
}
