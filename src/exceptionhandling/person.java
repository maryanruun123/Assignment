package exceptionhandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

public class person {

    static  int age;
    public static void main(String[] args) throws SQLException, IOException {

        setAge(-13);
        System.out.println("Age: " + age);

        readFile("Somalia");
    }




    //set Age
    //Throws throw     // unchecked Exceptions
    public static void setAge(int newAge) throws IllegalArgumentException{

        if (newAge > 0) {
            age = newAge;
        }
        else{
            throw new IllegalArgumentException("Age must be greater than Zero");
        }

    }

    // checked Exceptions
    public static void readFile(String path) throws FileNotFoundException, IOException, SQLException {
        File file = new File(path);
        FileInputStream is = new FileInputStream(file);
    }
}
