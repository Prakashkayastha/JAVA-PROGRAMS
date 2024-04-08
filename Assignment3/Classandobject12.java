//package Assignment3;
import java.util.*;
class Bank{
   double principal;
   double rate;
   int time;

     Bank(double principal,double rate,int time)
   {
    this.principal=principal;
    this.time=time;
    this.rate=rate;
   }
   double calculateSI()
   {
    return (principal*time*rate)/100;
   }
   double calculateCI()
   {
    return principal*(Math.pow((1+rate/100),time))-principal;
   }
   void displayIntrestDetails()
   {
    System.out.println("Principal = "+principal);
    System.out.println("Rate of intrest = "+rate);
    System.out.println("Time = "+time);
   }
   void displayBankInformation()
   {
    System.out.println("Generic Bank Information");
   }
}
class SBI extends Bank
{
    SBI(double principal,double rate,int  time)
    {
      super(principal,rate,time);
    }
    void displayBankInformation()
    {
        System.out.println("SBI (State Bank Of India)");
        displayIntrestDetails();
        System.out.println("Simple Interest: " + calculateSI());
        System.out.println("Compound Interest: " + calculateCI());
    }
}
class HDFC extends Bank
{
    HDFC(double principal,double rate,int time)
    {
        super(principal,rate,time);
    }
    void displayBankInformation()
    {
        System.out.println("HDFC (Housing Development Financial Corporation)");
        displayIntrestDetails();
        System.out.println("Simple Interest: " + calculateSI());
        System.out.println("Compound Interest: " + calculateCI());
    
    }
}
class ICICI extends Bank
{
    ICICI(double principal,double rate,int time)
    {
        super(principal,rate,time);
    }

    void displayBankInformation()
    {
        System.out.println("ICICI (Industrial Credit and Investment Corporation Of India)");
        displayIntrestDetails();
        System.out.println("Simple Intrest = "+calculateSI());
        System.out.println("Compound Intrest = "+calculateCI());
    }
}
class RBI extends Bank
{
    RBI(double principal,double rate,int time)
    {
        super(principal,rate,time);
    }
    void displayBankInformation()
    {
        System.out.println("RBI (Reserve Bank Of India)");
        displayIntrestDetails();
        System.out.println("Simple Intrest = "+calculateSI());
        System.out.println("Compound Intrest = "+calculateCI());

    }
}
public class Classandobject12 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the princiapl amount:");
        double principal=sc.nextDouble();
        System.out.println("Enter the rate of intrest:");
        double rate=sc.nextDouble();
        System.out.println("Enter the time");
        int time=sc.nextInt();
        SBI sbi = new SBI(principal,rate,time);
        HDFC hdfc = new HDFC(principal,rate,time);
        ICICI icici =new ICICI(principal,rate,time);
        RBI rbi = new RBI(principal,rate,time);

        Bank banks[]= {sbi,hdfc,icici,rbi};
        for(Bank bank:banks)
        {
            bank.displayBankInformation();
            System.out.println("-----------------------");
        }
        sc.close();
    }
}
