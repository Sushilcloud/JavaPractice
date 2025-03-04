import java.util.Scanner;

public class _12_Recursion_secretLanguageApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Encoder-Decoder Game");
        System.out.println(" 1: Encode a String");
        System.out.println(" 2: Decode a String");
        System.out.println(" Choose a option 1 or 2");
        scanner.nextLine();

        System.out.println("Enter a String");
        String input = scanner.nextLine();


    }

    public static char atbash(char ch) {
        if (ch >= 'a' && ch <= 'z') {
            return (char) ('z' - (ch - 'a'));
        } else if (ch >= 'A' && ch <= 'Z') {
            return (char) ('Z' - (ch - 'Z'));
        } else {
            return ch;
        }

    }
}
