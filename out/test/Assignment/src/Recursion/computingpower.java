package Recursion;

public class computingpower {
    public static void main(String[] args) {
        System.out.println(recursivepower(5,2));
        System.out.println(iterativePower(5, 2));


    }
    public  static int recursivepower(int x, int n){
        if(n==0)
            return 1;
        else  return x *  recursivepower(x , n-1);
    }

    public static int iterativePower(int x, int n) {
        int result = 1;
        for (int i = 0; i < n; i++) {
            result *= x;
        }
        return result;
    }



}
