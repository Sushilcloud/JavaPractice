import java.util.Scanner;
public class _3Calories_Counter_Pro {
    public static void main(String[] args){
        System.out.println("Calories Counter application");

        String food1,food2;
        int calories1,calories2;
        int total=0;
        Scanner scanner=new Scanner(System.in);
        // first food name
        System.out.println("Enter first food name=");
        food1=scanner.nextLine();
        System.out.println("Enter calories of first"+food1+" =");
        calories1 =scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter second food name=");
        food2=scanner.nextLine();
        System.out.println("Enter calories of second"+food2+" =");
        calories2 =scanner.nextInt();

        total=calories1+calories2;
        System.out.println("Total calories you have used in a day="+total);

    }

}
