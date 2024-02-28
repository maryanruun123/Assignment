package Searchingandsorting;

import java.util.Arrays;

public class SelecttionSort {

    public  void selection(int list[]) {
        int size = list.length;
        int min;
        for (int index = 0; index < size - 1; index++) {
            min = index;
            for (int scan = index + 1; scan < size; scan++) {
                if (list[scan] < list[min])
                    min = scan;

            }
            int temp = list[min];
            list[min] = list[index];
            list[index] = temp;
        }

    }



    public static void main(String[] args) {
        int data [] ={ 2,4,5,7,89,2,4,6,89,0};
        SelecttionSort sr = new SelecttionSort();
        System.out.println("unsorted");
        System.out.println(Arrays.toString(data));
        sr.selection(data);
        System.out.println("sorted");
        System.out.println(Arrays.toString(data));
    }
}
