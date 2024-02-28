package inheritance;

public class Jaamhuriya {
    String name;

    Jaamhuriya(){
        this("jamhuriya constdructur (parametrized)!");

        System.out.println("jamhuriya constructur no argument");

    }

    Jaamhuriya(String p){
        System.out.println(p);
    }
}
