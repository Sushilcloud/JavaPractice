import java.util.Scanner;

public class _12_Recusive_Method {
    public static void main(String[] args)
    {
        /*
        Recursion with Methods
        . About Recusion:   Recusion is a method calling iteself to solve a problem.its like a treasure hunt where each clue
        leads to the next until the treasure (base case)is found.

        Control condition of recursion:
        Base Case:  Stop the recursion , preventing infnite calls.
        Recursive Case: Continue the recursion by breaking down the problem and calling itself with smaller instance

         */

        // factorial 4 4!=4*3*2*1
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter number");
       int num = scanner.nextInt();


        int result=factorial(num);
        System.out.println(result);

    }

    public static int factorial(int n)
    {
        if(n==0)
        {
            return 1;
        }

        return n*factorial(n-1);
    }
}
