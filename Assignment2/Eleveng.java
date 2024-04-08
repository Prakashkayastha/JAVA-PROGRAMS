public class Eleveng {
    
    public static int calculateGCD(int a, int b) {
        if (b == 0) {
            return a;
        }
        return calculateGCD(b, a % b);
    }

  
    public static int calculateLCM(int a, int b) {
        return (a * b) / calculateGCD(a, b);
    }

    public static void main(String[] args) {
        int start = 23; 
        int end = 249;

        int gcdResult = start; 
        int lcmResult = start; 

       
        for (int i = start + 2; i <= end; i += 2) {
            gcdResult = calculateGCD(gcdResult, i);
            lcmResult = calculateLCM(lcmResult, i);
        }

        System.out.println("GCD of odd numbers from 23 to 249: " + gcdResult);
        System.out.println("LCM of odd numbers from 23 to 249: " + lcmResult);
    }
}

