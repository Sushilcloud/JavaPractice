import java.util.Scanner;

public class _8_fibonacci_Sequences {
    public static void main(String[] args)
    {
        // fibonacci sequences
        // 0 1 1 2 3 5 8 13

        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter the number of term");
        int n=scanner.nextInt();

        int firstNum=0,secondTerm=1;

        if(n==1)
        {
            System.out.println(firstNum);
        }
        else {
            System.out.println(firstNum+""+secondTerm);
            for(int i=0;i<=n;i++)
            {
                int nextTerm=firstNum+secondTerm;
                System.out.print(""+nextTerm);
                firstNum=secondTerm;
                secondTerm=nextTerm;
            }
        }
        scanner.close();
    }
}
