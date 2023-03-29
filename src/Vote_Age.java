import java.util.Scanner;

public class Vote_Age
{
    //using scanner method to take input from user.
Scanner scanner=new Scanner(System.in);
//Creating Method
    public void age()
    {
    //asking to user to enter age.
        System.out.println("enter your age: ");
        int Vote_age= scanner.nextInt();

        //Using if else condition

        if (Vote_age >= 18)
        {
            System.out.println("You are eligible for vote.");
        }
        else
        {
            System.err.println("Sorry you are not eligible for vote as you are not 18 year old.");
        }
    }
    public static void main(String[] args)
    {
        ////using class to call non static method into static method.
        Vote_Age vote=new Vote_Age();
        vote.age();
    }



}
