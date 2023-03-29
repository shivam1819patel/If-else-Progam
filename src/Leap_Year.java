import java.util.Scanner;

public class Leap_Year
{


        //Using Scanner method to take input from user.
        Scanner scanner = new Scanner(System.in);

        //Creating method for checking the given input year is leap year or not.

        public void leap_year()
        {
            //Using Sout statement to print message to ask user for input
            System.out.println("Please enter the year in integer:");
            int leapyear = scanner.nextInt();

            //using if else statement to verify that the user input year is a leap year or not.
            if (leapyear % 4 == 0)
            {
                System.out.println(leapyear + " is a leap year");
            }

            //Creating else statement for if the input year is not a leap year.
            else
            {
                System.err.println(leapyear + " is not a leap year");
            }

        }
        public static void main(String[] args)
        {
            //Creating class object to call non-static method in static main method.
            Leap_Year leap1 = new Leap_Year();

            //Calling method using class object in order to execute the program of leap year.
            leap1.leap_year();


        }
}
