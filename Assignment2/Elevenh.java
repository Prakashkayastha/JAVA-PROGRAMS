public class Elevenh {
    public static void main(String args[])
    {
        int even=0,odd=0,diff;
        for(int i=249;i>=23;i--)
        {
            if(i%2 == 0)
            {
                even=i;
                break;
            }
        }
        for(int i=23;i<=249;i++)
        {
            if(i%2 != 0)
            {
                odd=i;
                break;
            }
        }
        diff=even-odd;
        int rev=0;
        int temp=diff;
        while(temp > 0)
        {
            int rem=temp%10;
            rev =rev*10 + rem;
            temp /= 10;
        }
        if(rev == diff)
        System.out.println("Difference is a palindrome");
        else
        System.out.println("Difference is  ot a palindrome");
    }
}
