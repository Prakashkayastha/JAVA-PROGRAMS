package Assignment3;
import java.util.*;
import java.lang.Math;
class Siorci
{
    int p,t;
    double t2,r;
    void findintrest(int p,int t,double r)
    {
        this.p=p;
        this.t=t;
        this.r=r;
        double res=(p*t*r)/100;
        System.out.println("The simple intrest ="+res);
    }
    void findintrest(int p,double t2,double r)
    {
        this.p=p;
        this.t2=t2;
        this.r=r;
        
        double res= p*Math.pow(1+(double)r/100,t2)-p;
        System.out.println("The compound intrest = "+res);

    }
}

public class Poly3 {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      Siorci obj=new Siorci();
      int ch;
      int p,t;
      double t2,r;
      System.out.println("Enter the choice \n"+"1. For simple intrest \n2. For compound intrest");
      ch=sc.nextInt();
      if(ch == 1)
      {
        System.out.println("Enter the principal amount ,rate of intrest and time:");
        p=sc.nextInt();
        t=sc.nextInt();
        r=sc.nextDouble();
        obj.findintrest(p,t,r);
      }
      else if(ch == 2)
      {
        System.out.println("Enter the principal amount ,rate of intrest and time:");
        p=sc.nextInt();
        t2=sc.nextInt();
        r=sc.nextDouble();
        obj.findintrest(p,t2,r);
      }
    }
}
