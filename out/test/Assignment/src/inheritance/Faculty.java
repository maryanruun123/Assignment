package inheritance;

public class Faculty extends Employee {

    //constructor
    Faculty(){
        System.out.println("Faculty Constructor!");
     //   super.display();
     //  super.age = 60;
     //  System.out.println(super.age);
    }

    //method -- override display
    void display() {
        System.out.println("Display Faculty information!");
    }



}
