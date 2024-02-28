package Recursion;

public class sum {
    public static void main(String[] args) {
        System.out.println(summ(5));
        System.out.println(sum(5));


    }
    public static int summ(int num){
       int result1;
        if(num == 1)
            result1 = 1;
        else  result1=  num + summ(num-1);
            return  result1;
    }

    public static int sum(int num) {
        int result = 0;
        for (int i = 1; i <= num; i++) {
            result += i;
        }
        return result;
    }

}
