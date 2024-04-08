import java.util.Scanner;
import java.lang.Math;
public class Fourii {
    
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int x,n;
        System.out.println("Enter the value of x:");
        x=sc.nextInt();
        System.out.println("Enter the value of n:");
        n=sc.nextInt();
        double ans=x,count=0;
        for(int i=1;i<2*n-1;i=i+2)
        {
            count++;
            double num=Math.pow(x,i+2);
            System.out.println(num);
            double fact=1;
            for(int j=1;j<=i+2;j++)
            {
                fact *= j;
            }
            System.out.println(fact);
            ans += Math.pow(-1,count) * num/fact;
        }
        System.out.println(ans);
    }
}
