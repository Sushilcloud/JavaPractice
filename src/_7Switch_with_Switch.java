import java.util.Scanner;

public class _7Switch_with_Switch {
    public static void main(String[] arg)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please choose a or b");
        String choice=scanner.nextLine();

        switch (choice){
            case "a":
                System.out.println("now choose 1 or 2");
                String choice2=scanner.nextLine();
                switch (choice2){
                    case "1":
                        System.out.println("Thanks for choosing 1");
                        break;
                    case "2":
                        System.out.println("Thanks for choosing 2");
                        break;
                    default:
                        System.out.println("you choose wrongly");
                        break;
                }
            case "b":
            case "c":

        }
    }
}
