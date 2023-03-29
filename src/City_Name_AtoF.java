import java.util.Objects;
import java.util.Scanner;

public class City_Name_AtoF {

    //using scanner method to take input from user.
    Scanner stringscanner = new Scanner(System.in);


    public void AtoF() {
        //asking to user to enter city name.
        System.out.println("Please enter any alphabet between a-f");
        //creating input variable alphabet
        String AtoF = stringscanner.next();

        //using if-else statement

        if (Objects.equals(AtoF, "a") || Objects.equals(AtoF, "A")) {
            System.out.println("City name is: Anand");
        } else if (Objects.equals(AtoF, "b") || Objects.equals(AtoF, "B")) {
            System.out.println("City name is: Baroda");
        } else if (Objects.equals(AtoF, "c") || Objects.equals(AtoF, "C")) {
            System.out.println("City name is: Canada");
        } else if (Objects.equals(AtoF, "d") || Objects.equals(AtoF, "D")) {
            System.out.println("City name is: Dubai");
        } else if (Objects.equals(AtoF, "e") || Objects.equals(AtoF, "E")) {
            System.out.println("City name is: England");
        } else if (Objects.equals(AtoF, "f") || Objects.equals(AtoF, "F")) {
            System.out.println("City name is: Finland");
        } else {
            System.out.println("Invalid entry. Please enter alphabet between a-f.");
        }


    }

    public static void main(String[] args) {
        //using class to call non static method into static method.
        City_Name_AtoF city_name = new City_Name_AtoF();
        city_name.AtoF();

    }
}