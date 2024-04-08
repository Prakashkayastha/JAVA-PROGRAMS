package Assignment3;
import java.util.*;

class Box{
    //Area 
    void findarea(double r)
    {
        System.out.println("Area of circle : "+3.141*r*r);
    }
    void findarea(int side)
    {
        System.out.println("Area of square : "+side*side);
    }
    void findarea(int l,int br)
    {
        System.out.println("Area of rectangle : "+l*br);
    }
    void findarea(double a,double b,double c)
    {
        System.out.println("Area of triangle : "+0.5*b*c);
    }
    //perimeter
    void findperimeter(double r)
    {
       System.out.println("Perimeter of circle : "+2*3.141*r);
    }
     void findperimeter(int side)
    {
        System.out.println("Perimeter of square : "+4*side);
    }
     void findperimeter(int l,int br)
    {
        System.out.println("Perimeter of rectnagle : "+2*(l+br));
    }
     void findperimeter(double a ,double b,double c)
    {
        System.out.println("Perimeter of triangle : "+(a+b+c));
    }

}
public class Poly1 {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      Box obj=new Box();
      System.out.println("Enter the radius of the circle:");
      double r=sc.nextDouble();
      System.out.println("Enter the three sides of the triangle:");
      int a=sc.nextInt();
      int b=sc.nextInt();
      int c=sc.nextInt();
      System.out.println("Enter the length and breadth of the rectangle:");
      int l=sc.nextInt();
      int br=sc.nextInt();
      System.out.println("Enter the side of the square:");
      int side=sc.nextInt();
      obj.findarea(r);
      obj.findperimeter(r);
      obj.findarea(side);
      obj.findperimeter(side);
      obj.findarea(l,br);
      obj.findperimeter(l,br);
      obj.findarea(a,b,c);
      obj.findperimeter(a,b,c);
      
    }
}
