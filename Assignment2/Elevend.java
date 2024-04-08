import java.util.Scanner;
public class Elevend {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        for(int i=23;i<=249;i++)
        {
            int rev=0;
            int temp=i;
            while(temp >0)
            {
                int rem=temp%10;
                rev =rev*10 +rem;
                temp /= 10;
            }
            if(rev == i)
            System.out.println(i);
        }
    }
}
