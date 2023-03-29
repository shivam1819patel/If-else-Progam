import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Student_Grade
{
    //using scanner method to take input from user.
    Scanner grade = new Scanner(System.in);

    //Creating new method
    public void Grade()
    {
        //using Sout to take input for user name, roll number,3 subjects marks(Maths,Science,english).
        System.out.println("Enter user name");
        String name= grade.nextLine();

        System.out.println("Enter roll number");
        int roll_no= grade.nextInt();

        System.out.println("Enter marks of Maths");
        int Maths= grade.nextInt();

        System.out.println("Enter marks for Science");
        int Science= grade.nextInt();

        System.out.println("Enter marks for English");
        int English= grade.nextInt();

        //total for 3 subjects using variable.
        int Total = Maths+Science+English;
        System.out.println("Total of three subjects is : "+ Total);

        //For Percentage
        double percentage = Total/300.0*100.0;
        System.out.println("percentage is : "+ percentage);

        //Using if else statement in order to check grade according to percentage.
        if (percentage >= 80.00 )
        {
            System.out.println("Grade is: A+");
            System.out.println(name + " has passed the exam");
        }
        else if (percentage >= 60.00 && percentage < 80.00)
        {
            System.out.println("Grade is A");
            System.out.println(name + " has passed the exam");
        }
        else if (percentage >= 50.00 && percentage < 60.00)
        {
            System.out.println("Grade is B");
            System.out.println(name + " has passed the exam");
        }
        else if (percentage >= 35.00 && percentage < 50.00)
        {
            System.out.println("Grade is C");
            System.out.println(name + "has passed the exam");
        }
        else
        {
            System.out.println(name + " is failed");
        }

    }

    public static void main(String[] args)
    {
        //using class to call non static method into static method.

        Student_Grade grade=new Student_Grade();
        grade.Grade();

    }

}



