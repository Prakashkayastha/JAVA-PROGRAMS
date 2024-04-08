package Assignment3;
import java.util.*;
interface shape
{
    void calculatearea(double a,double b,double c);
    void calculatevolume(double a,double b,double c);
    void calculatecost(double a,double b,double c,double r);

}
class Threedimension implements shape
{
   public  void calculatearea(double a,double b,double c)
    {
        double res;
        res=2*(a*b+b*c+c*a);
        System.out.println("Area of rectangular box:"+res+" Sq.cm");
       
    }
   public  void calculatevolume(double a,double b,double c)
    {
        double res;
        res=a*b*c;
        System.out.println("Volume of rectangular box:"+res+" Cubic.cm");

    }
     public void calculatecost(double a,double b,double c,double r)
    {
        double amount;
        amount=2*(a*b+b*c+a*c)*4;
        System.out.println("Total cost of the rectangular box:"+"Rs. "+amount);

    }
}
class Rectangularbox extends Threedimension
{
   double l,w,h,r;
   Rectangularbox()
   {
     l=1;
     w=1;
     h=1;
     r=1;
   }
   void input()
   {
    System.out.println("Enter the length,breadth amd height of the rectangular box:");
    Scanner sc=new Scanner(System.in);
    l=sc.nextDouble();
    w=sc.nextDouble();
    h=sc.nextDouble();
    System.out.println("Enter the cost per square foot:");
    r=sc.nextInt();
    calculatearea(l,w,h);
    calculatevolume(l,w,h);
    calculatecost(l,w,h,r);
   }
}
public class Classandobject4 {
    public static void main(String args[])
    {
        Rectangularbox obj=new Rectangularbox();
        obj.input();
      
    }
}
