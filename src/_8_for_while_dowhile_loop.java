import java.util.Scanner;

public class _8_for_while_dowhile_loop {
    public static void main(String[] args){

        /* Intruduction of loop
        Definition: a loop repeatedly executes a block of code as long as a condition is met
        Purpose:    Perform repetitive task efficiently
        Benefit:    Reduce Code,redundancy , Simplify complex problem, enhance readability and maintainability
        Types:      for loop , while loop, do while loop

        for loop:   Repeat a block of code a specific number of times

        Syntax:
        for(initialization, condition, iteration)
        {
        // code to be executed
        }
        initialization: Runs once at loop start
        Condition:      Checked before each iteration; loop runs if true
        iteration:      Runs after each loop body execution
         */

        for(int i=0;i<=10;i++){
            System.out.println(i);
        }

        // nested for loop
        for(int k=0;k<10;k++)
        {
            System.out.print("This is outer loop"+k);
            for(int j=0;j<10;j++)
            {
                System.out.println("This is inner loop"+j);
            }
        }

        // Pyramid with loop
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the level");
        int level=scanner.nextInt();
        for(int p=0;p<=level;p++)
        {

            System.out.println(" ");

        for(int s=0;s<2*p-1;s++)
        {
        System.out.println("*");
    }
        }
    }
}
