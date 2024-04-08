package Assignment3;
import java.util.*;
import java.lang.Math;
abstract class Shape
{
  abstract void perimeter();
  abstract  void area();
  abstract void input();
}
class Rectangle extends Shape{
    int length,breadth;
    void input()
    {
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the length and breadth of the rectangle:");
     length=sc.nextInt();
     breadth=sc.nextInt();
    }
    void perimeter()
    {
        System.out.println("Perimeter of the rectangle:"+2*(length+breadth));
    }
    void area()
    {
        System.out.println("Area of the rectangle:"+length*breadth);
    }
}
class Triangle extends Shape{
    int a,b,c;
   void input()
   {
     Scanner sc=new Scanner(System.in);
      System.out.println("Enter the three sides of the triangle:");
      a=sc.nextInt();
      b=sc.nextInt();
      c=sc.nextInt();

   }
    void perimeter()
    {
        System.out.println("The perimeter of the triangle:"+(a+b+c));
    }
    void area()
    {
        double res=0;
        int hp=(a+b+c)/2;
        double sq=hp*(hp-a)*(hp-b)*(hp-c);
        res=Math.sqrt(sq);
        System.out.println("The area of the triangle:"+res);
    }
    
}
public class Classandobject5 {
    public static void main(String args[])
    {
    
        Shape obj1=new Rectangle();
        Shape obj2=new Triangle();
        
        obj1.input();
        obj2.input();
        obj1.perimeter();
        obj1.area();
        obj2.perimeter();
        obj2.area();


    }
}
