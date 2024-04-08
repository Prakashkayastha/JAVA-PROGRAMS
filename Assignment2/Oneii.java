
import java.util.Scanner;
public class  Oneii {
    
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int number;
        System.out.println("Enter the number:");
        number=sc.nextInt();
        int temp=number;
        int evensum=0;
        while(temp > 0)
        {
            int rem=temp%10;
            if(rem%2 == 0)
            evensum += rem;
            temp /= 10;
        }
        System.out.println("Sum of digits="+evensum);
    }
}
