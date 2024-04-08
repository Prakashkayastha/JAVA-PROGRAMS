import java.util.Scanner;
public class Stringfun {
    public static void main(String args[])
    {
        String s=new String();
        int flag=1;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string:");
        s=sc.nextLine();
        System.out.println("Given string is:"+s);
        int start=0;
        int end=s.length()-1;
        while(start < end)
        {
            if(s.charAt(start) != s.charAt(end))
            flag=0;
            start++;
            end--;
        }
        if(flag == 1)
        System.out.println("Palindrome");
        else
        System.out.println("Not palindrome");
    }
}
