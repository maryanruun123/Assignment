package Polymorphism;

public class C1 {

    //variable
    int age;
    protected int telephone;
    final int SIZE = 5;  // constant
    //constructor
    C1(int age){
        this.age = age ;
    }
    public C1(){
        age = 23;
    }

    //method
    public void display(){
        System.out.println("age : " + age);
    }

    void display(int age){
        System.out.println("age : " + age);
    }




}