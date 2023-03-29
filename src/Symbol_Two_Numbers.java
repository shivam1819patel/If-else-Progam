import java.util.Scanner;

public class Symbol_Two_Numbers
{
    Scanner scanner = new Scanner(System.in);
    public void Symbol()
    {
        //user input two numbers.
        System.out.println("Enter number one: ");
        int first = scanner.nextInt();
        System.out.println("Enter number two: ");
        int second = scanner.nextInt();
        System.out.println("Enter symbol from +,-,* or /: ");
        String a = scanner.next() ;

        int addition = first + second;
        int substraction = first - second;
        int multiplication = first * second;
        double division = first / second;

        //using if else statement.
        if (a.equals("+"))
        {
            System.out.println(addition);
        }
        else if (a.equals("-"))
        {
            System.out.println(substraction);
        }
        else if (a.equals("*"))
        {
            System.out.println(multiplication);
        }
        else if (a.equals("/"))
        {
            System.out.println(division);
        }

    }
    public static void main(String[] args)
    {
       //using class to call non static method into static method.

        Symbol_Two_Numbers Two_number_symbol = new Symbol_Two_Numbers();
        Two_number_symbol.Symbol();


    }



}
