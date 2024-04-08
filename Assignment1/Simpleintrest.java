 
 class Simpleintrest {
     
    public static void main(String args[])
    {
        int p,r,t;
       
        p=100;
        r=10;
        t=5;
        System.out.println("Principal amount = "+p);
        System.out.println("Rate of intrest = "+r);
        System.out.println("Time period = "+t);
        int si;
        si=(p*t*r)/100;
        System.out.println("Simple intrest is:"+si);

    }
}

