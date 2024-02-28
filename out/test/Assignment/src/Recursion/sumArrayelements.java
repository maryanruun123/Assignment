package Recursion;

public class sumArrayelements {
    public static void main(String[] args) {
        int data[] = {2,3,4,5,7,8,9};
        int sum =0;
        for (int i =0; i< data.length; i++){
            sum+= data[i];
        }
        System.out.println(sum);

        System.out.println(linearsum(data,6));
        System.out.println(sumlineaer(data));
    }


    public  static int linearsum(int data [],int n){
        if(n == 0)
            return data[n];
        else  return linearsum(data ,n-1) + data[n];
    }

        public static int sumlineaer(int list []){
        int total =0;
            for (int i = 0; i < list.length; i++) {
                total+= list[i];
            }
            return total;
        }
}
