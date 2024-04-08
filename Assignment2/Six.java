import java.util.Scanner;

public class Six {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int number;
        System.out.println("Enter the number:");
        number=sc.nextInt();
        int temp=number;
        int rev=0;
        while(temp > 0)
        {
            int rem = temp % 10;
            rev = rev *10 +rem;
            temp /= 10;
        }
        System.out.println(rev);
        if(number== rev)
        System.out.println("Given number is a palindrome");
        else 
        System.out.println("Given number is not a  palindrome");
    }
}
