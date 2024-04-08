import java.util.Scanner;
public class Elevene {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int palindrome_sum=0;
        int palindrome_count=0;
        int prime_sum=0;
        int prime_count=0;
        for(int i=23;i<=249;i++)
        {
            int rev=0;
            int temp=i;
            while(temp>0)
            {
                int rem=temp%10;
                rev =rev*10 + rem;
                temp /= 10;
            }
            if(rev == i)
            {
                palindrome_sum += i;
                palindrome_count ++;
            }
        }
        int avg1=palindrome_sum/palindrome_count;
        

        for(int i=23;i<=249;i++)
        {
            int flag=1;
            for(int j=2;j<i;j++)
            {
                if(i%j ==0)
                flag=0;
            }
            if(flag == 1)
            {
                prime_sum += i;
                prime_count++;
            }
        }
        int avg2=prime_sum/prime_count;
        System.out.println(avg1-avg2);
    }
}
