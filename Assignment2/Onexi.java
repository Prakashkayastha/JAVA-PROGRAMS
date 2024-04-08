//package Assignment2;
import java.util.Scanner;
public class Onexi {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int number;
        System.out.println("Enter the number:");
        number=sc.nextInt();
        int temp1=number,temp2=number;
        int evensum=0,oddsum=0,rem1=0,rem3=0;
        while(temp1>0)
        {
           int rem2=temp1%10;
           if(rem1%2 == 0 && rem2%2 ==0)
           {
             if((2%rem1 !=0 && 6%rem1 !=0)   && (2%rem2 !=0 && 6%rem2 !=0))
             evensum += rem1*rem2;
           }
           temp1 /= 10;
           rem1=rem2;
        }
        
        while(temp2>0)
        {
           int rem4=temp2%10;
           if(rem3%2 != 0 && rem4%2 != 0)
           {
             if((3%rem3 !=0 && 7%rem3 !=0)   && (3%rem4 !=0 && 7%rem4 !=0))
            oddsum+= rem3*rem4;
           }
           temp2 /= 10;
           rem3=rem4;
        }
        int diff=evensum-oddsum;
        System.out.println("Difference = "+ diff);
    }
}
