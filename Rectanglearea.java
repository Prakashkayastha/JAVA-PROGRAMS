import java.util.Scanner;
public class Rectanglearea {
    public static void main(String[] args) {
        int len,br;
        float area;
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter length of rectangle:");
        len=sc.nextInt();
        System.out.println("Enter breadth of the rectangle:");
        br=sc.nextInt();
        area=len*br;
        System.out.println("Area of rectangle is:"+area);
    }
}
