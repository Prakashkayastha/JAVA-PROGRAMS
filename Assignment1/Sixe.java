public class Sixe {
    public static void main(String args[])
    {
        int number=1356;
        int count1=0,count2=0,count3=0,count4=0;
        int rem1=number%10;
        count1=(rem1%2 != 0)?rem1:1;
        number /= 10;

        int rem2=number%10;
        count2=(rem2%2!=0)?rem2:1;
        number /= 10;

        int rem3=number%10;
        count3=(rem3%2!=0)?rem3:1;
        number /= 10;

        int rem4=number%10;
        count4=(rem4%2!=0)?rem4:1;
        number /= 10;


        int res=count2*count3 + count3*count4;
        System.out.println(res);
    }
}

