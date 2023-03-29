import java.util.Scanner;

public class Student_Pass_Fail {
    //using scanner method to take input from user.
    Scanner scanner = new Scanner(System.in);

    public void Pass_Fail() {
        //using Sout to take input for user name, roll number,3 subjects marks(Maths,Science,english).
        System.out.println("Enter user name");
        String name = scanner.nextLine();

        System.out.println("Enter roll number");
        int roll_no = scanner.nextInt();

        System.out.println("Enter marks of Maths");
        int Maths = scanner.nextInt();

        System.out.println("Enter marks for Science");
        int Science = scanner.nextInt();

        System.out.println("Enter marks for English");
        int English = scanner.nextInt();

        //total for 3 subjects using variable.
        int Total = Maths + Science + English;
        System.out.println("Total of three subjects is : " + Total);

        //For Percentage
        double percentage = Total / 300.0 * 100.0;
        System.out.println("percentage is : " + percentage);

        //Creating if else statement in order to check that student has passed each subject individually.
        if (Maths >= 35 && Science >= 35 && English >= 35) {
            System.out.println(name + " has passed the exam");
        } else {
            System.err.println(name + " is failed because he did not pass in all three individual subjects.");
        }

    }
    //Main method for execution of program
    public static void main (String[]args)
    {
        //using class to call non static method into static method.
        Student_Pass_Fail pass_fail = new Student_Pass_Fail();
        pass_fail.Pass_Fail();
    }
}