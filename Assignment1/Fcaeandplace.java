
public class Fcaeandplace {
    
    public static void main(String args[])
    {
       
       int number=1234;
       
       int thousandplace=number/1000;
       int hundredplace=(number/100)%10;
       int tensplace=(number/10)%10;
       int oneplace=number%10;
       
       System.out.println("Face and place value:");
       System.out.println("One place "+"Face value= "+oneplace +" Place value= "+oneplace*1);
       System.out.println("One place "+"Face value= "+tensplace +" Place value= "+tensplace*10);
       System.out.println("One place "+"Face value= "+hundredplace +" Place value= "+hundredplace*100);
       System.out.println("One place "+"Face value= "+ thousandplace +" Place value= " +thousandplace*1000);

    }
}
