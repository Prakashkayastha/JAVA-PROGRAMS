
 class Tempconvert {
    public static void  main(String args[])
    {
        int celcius,fahrenheit;
      
       
        celcius=75;
        int ans1;
        ans1=(celcius * 9/5)+32;
      
        fahrenheit=75;
        int ans2;
        ans2= (fahrenheit-32) * 5/9;
        System.out.println( celcius+" degree temperature in fahrenheit = "+ans1);
        System.out.println(fahrenheit+" degree temperature in celcius = "+ans2);

    }
}
