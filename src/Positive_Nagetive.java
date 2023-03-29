import java.util.Scanner;

public class Positive_Nagetive
{
    //using scanner method to take input from user.
    Scanner scanner= new Scanner(System.in);

    public void positive_nagetive()
    {
        //Ask user for input
        System.out.println("enter number: ");
        int no=scanner.nextInt();

        //if else if statement to check number is positive,negative or zero

        if (no > 0)
        {
            System.out.println("number is positive");
        }
        else if (no < 0)
        {
            System.out.println("number is negative");
        }
        else
        {
            System.out.println("number is equals to zero");
        }

    }
    public static void main(String[] args)
    {
        //Creating class object to call non-static method in static main method.
        Positive_Nagetive P_N = new Positive_Nagetive();

        P_N.positive_nagetive();

    }
}
