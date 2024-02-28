package Searchingandsorting;

public class Searching <T> {
    public static <T extends Comparable<T>> boolean search(T[] data, int min, int max, T target) {
        boolean found = false;
        int low = min;
        int high = max;
        while (low <= high && !found) {
            int mid = (low + high) / 2;
            if (data[mid].compareTo(target) == 0)
                found = true;
            else if (data[mid].compareTo(target) > 0)
                high = mid - 1;
            else
                low = mid + 1;
        }
        return found;
    }

    public static void main(String[] args) {
        Integer[] list ={1,2,34,5,6,6,9};
        boolean result = Searching.search(list,0,6,9);
        System.out.println(result);
        if(result)
            System.out.println("item found");
        else
            System.out.println("item not found");
    }
}