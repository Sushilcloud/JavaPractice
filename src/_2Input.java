// import Scanner class
import java.util.Scanner;
public class _2Input {

    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c=a+b;
        System.out.println("Sum of the two number is="+c);

        // user input
        // Scanner class from java.util(to import the class.)
        // create scanner object  create Scanner instance to read user input through keyboard

// now make instance of scanner class

        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter your name");
        String name=scanner.nextLine();

        System.out.println("User has entered his name="+name);

        int n1= scanner.nextInt();
        System.out.println("your first number="+n1);
        int n2= scanner.nextInt();
        System.out.println("your second number="+n2);
        int n3= n1+n2;
        System.out.println("Sum of two numberis"+n3);


       //
        System.out.println("Buffer Example");

        System.out.println("Enter your age");
        int age1=scanner.nextInt();
        scanner.nextLine(); // to consume the next line (enter key)

        System.out.println("Enter your name");
        String name1=scanner.nextLine();

        System.out.println("your name is "+ name1);
        scanner.close();

        ///
    }
}
