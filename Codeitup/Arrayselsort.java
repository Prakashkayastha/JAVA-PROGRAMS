import java.util.Scanner;
class sort
{
    int a[]=new int[50];
   
    void readarray(int arr[])
    {
        
       for(int i=0;i<arr.length;i++)
       {
        a[i]=arr[i];
       }
    }
    void selectionsort()
    {
        for(int i=0;i<a.length;i++)
        {
            for(int j=i;j<a.length-i;j++)
            {
                if(a[j] > a[j+1])
                {
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
        
    }
     void print()
    {
        for(int i=0;i<a.length;i++)
        {
            System.out.println(a[i]+" ");
        }
    }
}
public class Arrayselsort {
    public static void main(String args[])
    {
        int n;
        
        sort obj=new sort();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array size:");
        n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter elements:");
        for(int i=0;i<n;i++)
       {
        arr[i]=sc.nextInt();
       }
      
        obj.readarray(arr);
        obj.selectionsort();
        obj.print();


    }
}
