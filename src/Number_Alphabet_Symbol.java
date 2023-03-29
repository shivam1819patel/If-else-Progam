import java.util.Scanner;

public class Number_Alphabet_Symbol
{
    //using scanner method to take input from user.
    Scanner scanner = new Scanner(System.in);

    public void Input_VALUE()
    {
        //using SOUT to ask user for input.
        System.out.println("Enter any number between (0-9) or any alphabet or symbol.");

        char input = scanner.next().charAt(0);

        //using if else statement.

        if ((input >= 'a' && input <= 'z') || (input >= 'A' && input <= 'Z'))
        {
            System.out.println("Entered input is an ALPHABET");
        }
        else if (input >= '0' && input <= '9')
        {
            System.out.println("Entered input is a NUMBER");
        }
        else
        {
            System.out.println("Entered input is a SYMBOL or SPECIAL CHARACTER");
        }

    }

    public static void main(String[] args)
    {
        //using class to call non static method into static method.

        Number_Alphabet_Symbol N_A_S = new Number_Alphabet_Symbol();

        N_A_S.Input_VALUE();


    }
}
