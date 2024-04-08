import java.util.Scanner;
import java.lang.Math;
public class Fouriii {
    
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int x, n;
        System.out.println("Enter the value of x:");
        x=sc.nextInt();
        System.out.println("Enter the value of n");
        n=sc.nextInt();
        double ans=1;
        for(int i=1;i<2*n-1;i=i+2)
        {
            double num=Math.pow(x,i+1);
            double fact=1;
            for(int j=1;j<=i+1;j++)
            {
                fact *= j;
            }
            ans += num/fact;
        }
        System.out.println(ans);
    }
}
