package Assignment3;
import java.util.*;
interface Bankingoperations
{
    void deposit(double amount);
    void withdraw(double amount);
    void checkBalance();

}
class BankAccount implements Bankingoperations
{
    private double balance;
    BankAccount()
    {
        balance=1000;
    }
   public  void deposit(double amount)
    {
        if(balance >=1000)
        {
            balance += amount;
            System.out.println("Deposit succesful.Updated balance:Rs "+balance);
        }
        else
        {
            balance += amount-100;
            System.out.println("Low Balance. Penality 100 applied.Updated balance: Rs."+balance);
        }
    }
    public void withdraw(double amount)
    {
        if(balance > 1000)
        {
            balance -= amount;
            System.out.println("Withdraw succesful.Updated balance:Rs "+balance);
        }
        else
        {
            System.out.println("Low Balance.Can'yt Withdraw");
        }
    }
    public void checkBalance()
    {
        System.out.println("Current Balance is:"+balance);
    }

}
public class Classandobject7 {
    public static void main(String args[])
    {
        BankAccount obj=new BankAccount();
        obj.checkBalance();
        obj.deposit(2000);
        obj.withdraw(400);
    }
}
