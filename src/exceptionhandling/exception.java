package exceptionhandling;

import java.io.File;

public class exception {
    public static void main(String[] args) {
        //unchecked exceptions
        //1.ArithmeticException   /by zero
        try {
            String name = "ahmed";
            System.out.println(name.length());
            System.out.println(2 / 2);
        }
        catch(ArithmeticException e){
            System.out.println("Exception: / by zero");
        }
        catch (NullPointerException e) {
            System.out.println("Exception: NullPointerException");
        }
        finally {
            System.out.println("Done!");
        }

        //2. NullPointerException
        String name = null;
        //System.out.println(name.length());

        test ob = null;
        System.out.println(ob.toString());

        //3. IndexOutOfBoundsException
        int nums[] = {1, 2};
        System.out.println(nums[3]);

        //checked exceptions
        //1. FilenotfoundException
        String filename = "file not found";
        File file = new File(filename);

        //FileInputStream input = new FileInputStream(file);


    }
}
