package exceptionhandling;

public class exceptiontry {

    public static void main(String[] args) {
        try{
            System.out.println( 2 / 2 );
            String name = "Halima";
            System.out.println(name.length());
          //   person = new Person();
         //   System.out.println(person.toString());

            int[] values = {1, 2, 3, 4, 5, 6};
            System.out.println(values[0]);
        }
        catch(ArithmeticException ex){
            System.out.println(ex.getMessage());
        }
        catch(NullPointerException ex){
            System.out.println(ex.getMessage());
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("final statement");
        }
    }
}
