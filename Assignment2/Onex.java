
import java.util.Scanner;
public class Onex {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int number;
        System.out.println("Enter the number:");
        number=sc.nextInt();
        int temp=number;
        int sum=0,rem1=0;
       
        while(temp>0)
        {
            int check1=1,check2=1;
            int rem2=temp%10;
            for(int i=2;i<rem1;i++)
            {
                if(rem1%i == 0)
                {
                    check1=0;
                    break;
                }
            }
            for(int i=2;i<rem2;i++)
            {
                if(rem2%i == 0)
                {
                    check2=0;
                    break;
                }
            }
            if(check1 ==1 && check2==1)
            sum += rem1*rem2;

            temp /= 10;
            rem1=rem2;
        }

        System.out.println(sum);

    }
}
