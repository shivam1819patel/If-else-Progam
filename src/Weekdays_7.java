import java.util.Scanner;

public class Weekdays_7
{
    //using scanner method to take input from user.
    Scanner scanner = new Scanner(System.in);

    //creating method to build a function
    public void Week_Day()
    {
        //using Sout for Taking input from user in number from 1-7.
        System.out.println("Please enter any number between 1-7:  ");
        int a = scanner.nextInt();

        //If else statements.
        if (a == 1)
        {
            System.out.println("MONDAY");
        }
        else if (a == 2)
        {
            System.out.println("TUESDAY");
        }
        else if (a == 3)
        {
            System.out.println("WEDNESDAY");
        }
        else if (a == 4)
        {
            System.out.println("THURSDAY");
        }
        else if (a == 5)
        {
            System.out.println("FRIDAY");
        }
        else if (a == 6)
        {
            System.out.println("SATURDAY");
        }
        else if (a == 7)
        {
            System.out.println("SUNDAY");
        }
        else
        {
            System.err.println("Please enter number between 1-7");
        }
    }

    public static void main(String[] args)
    {
        //using class to call non static method into static method.
        Weekdays_7 Week = new Weekdays_7();

        Week.Week_Day();
    }
}
