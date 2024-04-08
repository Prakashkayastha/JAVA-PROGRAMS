import java.util.*;
abstract class Figure
{
    abstract void findarea();
    abstract void findperemeter();

}
class Rectangle extends Figure
{
    double len,br;
    Rectangle(double a,double b)
    {
        len=a;
        br=b;
    }
    void findarea()
    {
        System.out.println("The area of the rectangle:"+len*br);
    } 
    void findperemeter()
    {
        System.out.println("The peremeter of the rectangle:"+0.5*(len+br));
    } 

}
class Triangle extends Figure
{
    double a,b,c;
    Triangle(double a,double b,double c)
    {
        this.a=a;
        this.b=b;
        this.c=c;
    }
    void findarea()
    {
        System.out.println("The area of the Triangle:"+0.5*b*c);
    } 
    void findperemeter()
    {
        System.out.println("The peremeter of the Triangle:"+(a+b+c));
    } 

}
public class Q4 {
    
    public static void main(String args[])
    {
        Figure ref;
        Rectangle obj1=new Rectangle(4,12);
        Triangle obj2=new Triangle(3,4,5);
        ref=obj2;
        ref.findarea();
        ref.findperemeter();
    }
}
