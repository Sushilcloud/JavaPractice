import java.util.Scanner;

public class _6Z_FindBiggestNumber {
    public static void main(String[]  arg)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter first number");
        int firstNum= Integer.parseInt(scanner.nextLine());
        int second= Integer.parseInt(scanner.nextLine());
        int third= Integer.parseInt(scanner.nextLine());

        if((firstNum>second) && (firstNum>third))
        {
        System.out.println("First is biggest number");
        }
        else if ((second>firstNum) && (second>third))  // Logical Operator used here
            System.out.println("Second is biggest number");
             else
        {
            System.out.println("third is biggest number");
        }

        }

}
