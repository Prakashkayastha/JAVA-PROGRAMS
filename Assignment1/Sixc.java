public class Sixc {
    public static void main(String args[])
    {
        int number=7882;
        int evensum=0,oddsum=0,evencount=0,oddcount=0,rem1,rem2,rem3,rem4,rem5,rem6,rem7,rem8;
        int temp1=number;
        int temp2=number;
        int average1,average2;
        rem1=temp1%10;
        evensum += (rem1%2==0 &&rem1%4!=0)? rem1: 0;
        evencount += (rem1%4!=0 && rem1%2==0)?1:0;
        temp1 /= 10;

        rem2=temp1%10;
        evensum += (rem2%2==0 &&rem2%4!=0)?rem2:0;
        evencount += (rem2%4!=0 && rem2%2==0)?1:0;
        temp1 /= 10;

        rem3=temp1%10;
        evensum += (rem3%2==0 &&rem3%4!=0)?rem3:0;
        evencount += (rem3%4!=0 && rem3%2==0)?1:0;
        temp1 /= 10;

        rem4=temp1%10;
        evensum += (rem4%2==0 &&rem4%4!=0)?rem4:0;
        evencount += (rem4%4!=0 && rem4%2==0)?1:0;
        temp1 /= 10;
        average1 = evensum/evencount;
        System.out.println(average1);


        rem5=temp2%10;
        oddsum += (rem5%2!=0 &&rem5%3!=0)? rem5: 0;
        oddcount += (rem5%3!=0 && rem5%2!=0)?1:0;
        temp2 /= 10;

        rem6=temp2%10;
        oddsum += (rem6%2!=0 &&rem6%3!=0)? rem6: 0;
        oddcount += (rem6%3!=0 && rem6%2!=0)?1:0;
        temp2 /= 10;

        rem7=temp2%10;
        oddsum += (rem7%2!=0 &&rem7%3!=0)? rem7: 0;
        oddcount += (rem7%3!=0 && rem7%2!=0)?1:0;
        temp2 /= 10;

        rem8=temp2%10;
        oddsum += (rem8%2!=0 &&rem8%3!=0)? rem8: 0;
        oddcount += (rem8%3!=0 && rem8%2!=0)?1:0;
        temp2 /= 10;
        average2=oddsum/oddcount;
        System.out.println(average2);

        

        

        

    }
}
