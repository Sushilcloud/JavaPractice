public class _7SwitchControlStatement {
    public static void main(String[] args){

        /*
        Introduction to Switch Control Statement
        Definition: The Switch statemnt offers a readable alternative to if-else-if for
        handling multiple condtion based on a single variable

        Syntax
            switch(expression){
            case value1:
            // code to execute
            break;
            case value2:
            // code to execute
            break;
            default:
            // code to execute
            }
            */
        int day=3;
        String dayname;
        switch (day){
            case 1:
                dayname="Monday";
                break;

            case 2:
                dayname="Tuesday";
                break;

            case 3:
                dayname="Wednesday";
                break;
            default:
                dayname="NA";
                break;
        }
        System.out.println("Day name is"+dayname);
    /*
        int day=3;
        String dayname = switch (day) {
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            default -> "NA";
        };
        System.out.println("Day name is"+dayname);

    */

        // if statement with switch Statement
        int marks=85;
        String grade;
        switch (marks/2){
            case 10:
                grade="A";
                        break;

            case 9:
                grade="B";
                break;


            case 8:
                grade="C";
                break;


            default:
                grade="D";
                break;
        }
        System.out.println("Grade is "+grade);


        // switch statment with char data type

        char grade1='F';

        switch (grade1){
            case 'A':
                System.out.println("Your Grade is A");
                break;
            case 'B':
                System.out.println("Your Grade is B");
                break;
            case 'C':
                System.out.println("Your Grade is C");
                break;
            default:
                System.out.println("Your Grade is not in list");
                break;
        }

        // *********Switch control statement with String***********
    System.out.println("*********Switch control statement with String***********");
        String season="Summer";
        switch (season){
            case "winter":
                System.out.println("Season is winter");
                break;

            case "Summer":
                System.out.println("Season is Summer");
                break;
            default:
                System.out.println("No Season");
                break;

        }

        // enums and swith


    }
}
