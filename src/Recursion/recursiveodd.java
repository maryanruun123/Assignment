package Recursion;

public class recursiveodd {
    public static void main(String[] args) {
        int data[] = {1,2,3,4,5};
        System.out.println(recursivoddnumber(data,4));

    }
    public static int recursivoddnumber(int data[] ,int n) {
        if(n %2!=0)
            return n;
        else
            return (recursivoddnumber(data,n-1))+ data[n];
    }

}



