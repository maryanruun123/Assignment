package inheritance;

public class Employee extends Jaamhuriya  {


    int age = 50;
    Employee(){
        //invoke constructor with arguments
        this("Employee parametrized constructor!");
        System.out.println("Employee No-arg Constructor !");
    }
    Employee(String s){
        System.out.println(s);
    }


    //method
    void display(){
        System.out.println("employee display method");
    }
}
