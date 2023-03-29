import java.util.Scanner;

public class Gross_Salary {
    Scanner scanner = new Scanner(System.in);

    public void gross_salary()
    {
        //Sout to input employee id
        System.out.println("Please enter your employee id in integer:");
        int employee_id = scanner.nextInt();

        //Sout to input name.
        System.out.println("Please enter your name:");
        String name = scanner.next();

        //Sout to basic salary
        System.out.println("Please enter your basic salary");
        int basic_salary = scanner.nextInt();

        //For HRA
        double HRA = basic_salary * (10.0/100.0);
        System.out.println("Your HRA is: " + HRA);

        //For TA
        double TA = basic_salary * (9.0/100.0);
        System.out.println("Your TA is: " + TA);

        //For DA
        double DA = basic_salary * (8.0/100.0);
        System.out.println("Your DA is: " + DA);

        //For PF
        double PF = basic_salary * (20.0/100.0);
        System.out.println("Your PF is: " + PF);

        //For Gross salary
        double gross_salary = basic_salary+HRA+TA+DA-PF;
        System.out.println("Your gross salary is: " + gross_salary);


    }

    public static void main(String[] args)
    {
        //using class to call non static method into static method.
        Gross_Salary gross1_salary1 = new Gross_Salary();

        gross1_salary1.gross_salary();

    }

}
