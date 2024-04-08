
import java.util.Scanner;
public class Onev {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int number;
        System.out.println("Enter the number:");
        number=sc.nextInt();
        int temp=number;
        int sum1=0,sum2=0,avg1,avg2,diff,count1=0,count2=0;
        while(temp>0)
        {
            int rem=temp%10;
            if(rem%2 == 0 && rem%4 !=0)
             {
                sum1 += rem;
                count1++;
             }
             else if(rem%2 !=0 && rem%3 !=0)
             {
                sum2 += rem;
                count2++;
             }
             temp /= 10;
        }
        avg1=sum1/count1;
        avg2=sum2/count2;
        System.out.println(avg1 +" "+ avg2);

    }
}
