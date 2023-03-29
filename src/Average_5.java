import java.util.Scanner;

public class Average_5
{
    //using scanner method to take input from user.
    Scanner scanner = new Scanner(System.in);

    public void Average()
    {
        //Sout to take first number
        System.out.println("Enter first number: ");
        double a = scanner.nextDouble();

        //Sout to take second number
        System.out.println("Enter second number: ");
        double b = scanner.nextDouble();

        //Sout to take third number
        System.out.println("Enter third number: ");
        double c = scanner.nextDouble();

        //Sout to take fourth number
        System.out.println("Enter fourth number: ");
        double d = scanner.nextDouble();

        //Sout to take fifth number
        System.out.println("Enter fifth number: ");
        double e = scanner.nextDouble();

        //Calculating average
        double average_f = (a+b+c+d+e)/5;
        System.out.println("The average of the above five numbers is: " + average_f);


    }
    public static void main(String[] args)
    {
        //using class to call non static method into static method.
        Average_5 average_five = new Average_5();


        average_five.Average();
    }

}
