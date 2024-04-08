/*Override some method if arguments are number then add if string ten concat using constructor overloading */
//package PYQ;
import java.util.*;
class Numorstr
{
    int add(int a,int b)
    {
        return a+b;
    }
    String add(String a,String b)
    {
        return a+b;
    }
    Numorstr(int x,int y)
    {
        int sum= add(x,y);
        System.out.println(x+y);
    }
    Numorstr(String a,String b)
    {
        String ans=add(a,b);
        System.out.println(a+b);
    }

}
public class Q2 {
   public static void main(String args[])
   {
        Numorstr obj=new Numorstr(1,2);
        Numorstr obj2=new Numorstr("Prakash"," Kayastha");
   }   
}
