//package RameshSir;
import java.util.*;
class Test1 extends Thread{
    Thread t;
    String tnm;
    Test1(String nm)
    {
        tnm=nm;
        t=new Thread(this,nm);
        System.out.println(Thread.currentThread());
        t.start();
    }

    public void run()
    {
        String m=Thread.currentThread().getName();
        try{
            for(int i=5;i>0;i--)
            {
              System.out.println(m+":-"+i);
            }
            Thread.sleep(500);
        }
        catch(InterruptedException ie)
        {
           System.out.println(m+" Thread has interrupted");
        }
        System.out.println(m+" Thread terminated");
    }
}
public class Thread1 {
    public static void main(String args[])
    {
        Test1 t1=new Test1("demo");
        String m=Thread.currentThread().getName();
        try{
            for(int j=1;j<=5;j++)
            {
                System.out.println(m+":-"+j);
            }
            Thread.sleep(1000);
        }
        catch(InterruptedException ie)
        {
            System.out.println("Thread Interrupted");
        }
        System.out.println("Thread terminated");
    }
}
