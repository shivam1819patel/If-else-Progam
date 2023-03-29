import java.util.Scanner;

public class Interchange_Number

{
    //using scanner method to take input from user.

    Scanner scanner = new Scanner(System.in);

    public void Change_number() {
        // Asking to user enter one number
        System.out.println("Enter one number:");
        int a = scanner.nextInt();

        //Asking to user enter second number
        System.out.println("Enter second number:");
        int b = scanner.nextInt();

        //create new variable to store value of "a".
        int c = a;

        //Exchanging values
        a = b;
        b = c;

        System.out.println("Interchanged value is " + a + "and" + "" + b);

    }

    public static void main(String[] args) {


        //calling non static method in static area.
        Interchange_Number number = new Interchange_Number();
        number.Change_number();

    }

}

