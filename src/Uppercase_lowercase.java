import java.util.Scanner;

public class Uppercase_lowercase
{
    //using scanner method to take input from user.

    Scanner scanner=new Scanner(System.in);

    public void Upper_lover()
    {
        //sout for user input.
        System.out.println("Enter any alphbet in uppercase:");
        String a= scanner.next();

        //using concatenation and inbuild method for print output.
        System.out.println("your latter in lowercase is:" +a.toLowerCase());

    }
    public static void main(String[] args)
    {
        Uppercase_lowercase upper_lower=new Uppercase_lowercase();
        upper_lower.Upper_lover();
    }
}
