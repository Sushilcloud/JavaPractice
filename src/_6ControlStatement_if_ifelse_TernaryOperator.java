import java.util.Scanner;

public class _6ControlStatement_if_ifelse_TernaryOperator {
    public static void main(String[] args){
        // importance - condition statement enables decision making in code, allowing different actions based on different conditions.
        /* Types of Conditional Statements:
        1   if staementss
        2   if-else statements
        3   if else if Ladder
        4   switch statemets

         */
        boolean sunny=true;
        if(sunny){
            System.out.println("Such a lovely day");

        }

        int a=5;
        if(a<10){
            System.out.println("a is less than 10");
        }
        System.out.println("a is more than 10");

        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter you name");
        String name=scanner.nextLine();
        if(name.equals("sushil")){
            System.out.println("this is my name");
        }
        System.out.println("This is not my name");

    System.out.println("**************Nested If ****************");

        System.out.println("Please enter firstNumer");
    int firsNum= Integer.parseInt(scanner.nextLine());
    int secNum= Integer.parseInt(scanner.nextLine());
    int thirdNum= Integer.parseInt(scanner.nextLine());

    if(firsNum>secNum){
        if(firsNum>thirdNum){
        System.out.println("First number is a biggest number");
        }

        System.out.println("Other number can be bigger");
    }


    scanner.close();
    }


    // Logical Operator
    boolean aa=true;
    boolean bb=false;

    // double ampersand
    // Logical AND
    // if aa and bb are true only then the result of logical is AND will be true

    boolean result= aa && bb; // false

    // Logical || Operator
    boolean result1= aa||bb; // true because if any one condition is true then result is true

}
