
public class Sumv {
 
        public static void main(String[] args) {
           
           int num1,num2;
          
           num1=1234;
          
           num2=4321;
           int rem1,rem2,rem3,rem4;
           int rem5,rem6,rem7,rem8;
           int sum=0;
           int temp1=num1;
           int temp2=num2;
           rem1=temp1%10;
           rem5=temp2%10;
           temp1 /= 10;
           temp2 /= 10;

           rem2=temp1%10;
           rem6=temp2%10;
           temp1 /= 10;
           temp2 /= 10;

           rem3=temp1%10;
           rem7=temp2%10;
           temp1 /= 10;
           temp2 /= 10;

           rem4=temp1%10;
           rem8=temp2%10;

           sum= rem1*rem5 + rem2*rem6 + rem3*rem7 + rem4* rem8;
           System.out.println("Sum="+sum);


        }
    
    
}
