package Assignment3;
import java.util.*;
abstract class NumberSwapper
{
    abstract void withthirdvariable(int a,int b);
    abstract void withoutthirdvariable(int a,int b);
}
class Concretenumberswapper extends NumberSwapper
{
    void withthirdvariable(int a,int b)
     {
        System.out.println("Before swapping with third variable:"+a+"  and "+b);
         int temp=a;
         a=b;
         b=temp;
         System.out.println("After swapping with third variable:"+a+" and "+b);
     }

    void withoutthirdvariable(int a,int b)
     {
        System.out.println("Before swapping with out third variable:"+a+"  and "+b);
        a=a^b;
        b=a^b;
        a=a^b;
        System.out.println("After swapping with out third variable:"+a+" and "+b);

     }
}
public class Classandobject11 {
    public static void main(String args[])
    {
        Concretenumberswapper obj=new Concretenumberswapper();
        obj.withthirdvariable(8,11);
        obj.withoutthirdvariable(12,16);

    }
}
