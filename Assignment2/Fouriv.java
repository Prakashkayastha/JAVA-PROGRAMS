import java.util.Scanner;
import java.lang.Math;
public class Fouriv {
    
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int x,n;
        System.out.println("Enter the value of x:");
        x=sc.nextInt();
        System.out.println("Enter the value of n:");
        n=sc.nextInt();
        double ans=x,count=0;
        int anscount=0;
        for(int i=1;i<3*n-1;i=i+2)
        {
            int flag=1;
            count++;
            int k=i+2;
            for(int s=2;s<k;s++)
            {
                if(k%s == 0)
                  flag=0;
            }
            if(flag == 0)
            continue;
            double num=Math.pow(x,i+2);
            System.out.println(num);
            double fact=1;
            for(int j=1;j<=i+2;j++)
            {
                fact *= j;
            }
            System.out.println(fact);
            anscount++;
            ans += Math.pow(-1,count) * num/fact;
            if(anscount == n-1)
            break;
        }

        System.out.println(ans);
    }
}

