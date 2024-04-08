package Assignment3;
class Summethod
{
    int sum(int a,int b)
    {
        return a+b;
    }
    String sum(String a,String b)
    {
        return a+b;
    }
    Summethod(int a,int b)
   {
    int result=sum(a,b);
    System.out.println("The addition of two number is:"+result);
   }
    Summethod(String a,String b)
   {
    String res=sum(a,b);
    System.out.println("The concatination of two string is:"+res);
   }
}
public class Poly5 {
    public static void main(String args[])
    {
        Summethod numsum=new Summethod(4,8);
        Summethod stringsum=new Summethod("Prakash","kumar");
        
    }
}
