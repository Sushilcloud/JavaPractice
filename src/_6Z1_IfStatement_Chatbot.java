import java.util.Scanner;

public class _6Z1_IfStatement_Chatbot {
    public static void main(String[] arg)
    {
        // create a scanner object to read user input
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter your prompt");
        // store user input in a variable
        String userInput=scanner.nextLine();

        // check the user input is a greeting (e.g "hello, or Hi)
        if(userInput.equalsIgnoreCase("hello") || (userInput.equalsIgnoreCase("hi")))
        {
            System.out.println("chatbot: Hi there , how are you");
        }


        // check the user input is an inquiry about well-being
        if(userInput.equalsIgnoreCase("How are you") || (userInput.equalsIgnoreCase("How's it going")))
        {
            System.out.println("chatbot: i am just a robot and have no feelings");
        }

        // about weather
        if(userInput.equalsIgnoreCase("weather") || (userInput.equalsIgnoreCase("what's the weather like")))
        {
            System.out.println("chatbot: its a sunny day");
        }

        // if the user input bye , farewell, goodbye


        if(userInput.equalsIgnoreCase("bye") || (userInput.equalsIgnoreCase("goodbye") || (userInput.equalsIgnoreCase("ok done"))))
        {
            System.out.println("ok Bye");
        }

        if(!(userInput.equalsIgnoreCase("hello") || (userInput.equalsIgnoreCase("hi")
        ||(userInput.equalsIgnoreCase("How are you") || (userInput.equalsIgnoreCase("How's it going")
        || (userInput.equalsIgnoreCase("weather") || (userInput.equalsIgnoreCase("what's the weather like")
        || (userInput.equalsIgnoreCase("bye") || (userInput.equalsIgnoreCase("goodbye") || (userInput.equalsIgnoreCase("ok done")
         ))))))))))
        {
            System.out.println("entry not matched");
        }
    }
}
