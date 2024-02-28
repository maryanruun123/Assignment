package Recursion;

public class fibbnacicnumber {
    public static void main(String[] args) {
        System.out.println(fibnaci(10));

        System.out.println(iterativeFibonacci(10));
        System.out.println(fibonic(10));
    }



    public static int fibnaci(int n){
        if(n<=1)
            return n;
        else return fibnaci(n-2) + fibnaci(n-1);
    }


    public static int iterativeFibonacci(int n) {
        if (n <= 1) {
            return n;
        }

        int prev1 = 0, prev2 = 1;
        for (int i = 2; i <= n; i++) {
            int newFib = prev1 + prev2;
            prev1 = prev2;
            prev2 = newFib;
        }
        return prev2; // Return prev1 instead of prev2
    }


    public static int fibonic(int n) {
        // Initialize the first two Fibonacci numbers to 0 and 1
        int a = 0;
        int b = 1;
        // Loop from 0 to n
        for (int i = 0; i < n; i++) {
            // Calculate the next Fibonacci number as the sum of the previous two
            int c = a + b;
            // Update the previous two Fibonacci numbers
            a = b;
            b = c;
        }
        // Return the nth Fibonacci number
        return a;
    }





}
