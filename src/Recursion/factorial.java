package Recursion;

public class factorial {
    public static void main(String[] args) {
    int resul = facoria(5);
        System.out.println(resul);
        System.out.println(factorial(5));
    }
    public static int facoria(int num){
        if(num == 0)
            return  1;
        else return  num * facoria(num-1);
    }


    public static int factorial(int num) {
        int result = 1;
        for (int i = 1; i <= num; i++) {
            result *= i;
        }
        return result;
    }

}
