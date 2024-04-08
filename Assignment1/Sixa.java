public class Sixa {
    
    public static void main(String args[])
    {
        int number=2465;
        int sum=0;
        int rem1,rem2,rem3,rem4;
        int temp=number;
        rem1=temp%10;
        sum += (rem1%2==0)?rem1:0;
        temp /= 10;

        rem2=temp%10;
        sum += (rem2%2==0)?rem2:0;
        temp /= 10;

        rem3=temp%10;
        sum += (rem3%2==0)?rem3:0;
        temp /= 10;

        rem4=temp%10;
        sum += (rem4%2==0)?rem4:0;
        temp /= 10;

        System.out.println(sum);

    }
}
