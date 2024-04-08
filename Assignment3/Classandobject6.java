//package Assignment3;
import java.util.*;
abstract class Shape{
    abstract void display();
}
class Rectangle extends Shape{
    void display()
    {
        System.out.println("The shape is Rectangle");
    }
}
class Triangle extends Shape{
     void display()
    {
        System.out.println("The shape is Triangle");
    }
}
class Square extends Shape{
     void display()
    {
        System.out.println("The shape is Square");
    }
}
public class Classandobject6 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int side,length,breadth;
        System.out.println("Enter the sides of the shape :");
        side = sc.nextInt();
        if (side ==3)
        {
            Triangle t=new Triangle();
            t.display();
        }
        else if (side == 4){
            System.out.println("Enter length and breadth :");
            length = sc.nextInt();
            breadth = sc.nextInt();
            if (length==breadth)
            {
                Square s=new Square();
                s.display();

            }
            else{
                Rectangle r=new Rectangle();
                r.display();
            }
            
        }
         

      

        
    }
}
