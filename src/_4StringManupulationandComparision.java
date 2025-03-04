public class _4StringManupulationandComparision {

    public static void main(String[] args)
    {
        // String represt a sequnces of character : String in java are immutable
        // Creating Strings: String can be created using String literals or the 'new' keyword
        // concatenation Joining two or more strings together using the + operators
        // Length of a String: Find the number of character in a string . Method 'length()'
        // character at a specific index Get the character at a specific index in a string Method 'charAt()'


        String morning="Good Morning";
        System.out.println(morning);
        morning="Bad morning"; // overwriting string value
        System.out.println(morning);

        // String concatenation
        String firstName="Sushil";
        String lastName="Godiyal";
        System.out.println(firstName+lastName); //concat
        int len=firstName.length();  // length for a string
        System.out.println(len);





        // CharAT POSITION
        char sushil=morning.charAt(4);
        // charAt(Index) where index is the position of the character within the sentences
        System.out.println(sushil);


        // STRING COMPARASION

        // comparing "referance"
        String firstString="Sushil";
        String secondString="Sushil";
        String thirdString="Lokesh";
        String fourtString=new String("Sushil");  //here we are forcing to create String on memory

        System.out.println("Comparastio of first string "+firstString+" with second string "+secondString+"is equal "+(firstString==secondString)
                // refer to same address
        );
        // do not have same address
        System.out.println("Comparastio of first string "+firstString+" with fourth string "+fourtString+"is equal "+(firstString==fourtString));

        // when we are using both have true result both hold the same value // comparing the value of both variable while ignore case sensetive
        System.out.println("Comparastio of first string "+firstString+" with fourth string "+fourtString+"is equal "+firstString.equals(secondString));
        System.out.println("Comparastio of first string "+firstString+" with fourth string "+fourtString+"is equal "+firstString.equals(fourtString));

        System.out.println("*****************************");
        System.out.println("STRING COMPARISION WITH COMPARE TO LOGICOGRAPHILLY");

        String animal1="cat";
        String animal2="dog";
        String animal3="cat";
        String animal4="eat";

    // alphabativally wise order plus and minus
        System.out.println("Compare animal1 to animal2 using compare()"+animal1.compareTo(animal2));
        System.out.println("Compare animal2 to animal3 using compare()"+animal2.compareTo(animal3));
        System.out.println("Compare animal3 to animal1 using compare()"+animal3.compareTo(animal1));
        System.out.println("Compare animal2 to animal4 using compare()"+animal2.compareTo(animal4));
        System.out.println("Compare animal4 to animal2 using compare()"+animal4.compareTo(animal2));


        System.out.println("*****************************");
        System.out.println("SUB STRING METHOD");

        String phrase="Programming in java";
        String  word=phrase.substring(5);
        String  word1=phrase.substring(0,5);
        System.out.println(word);
        System.out.println(word1);

        System.out.println("*****************************");
        System.out.println("REPLACE , TOLOWER, TOUPER");
        
        String phrase1="Programming in java";
        String mph=phrase1.replace('o','A'); // replace o with A
        System.out.println(mph); // print with replace

        String upperCase=phrase1.toUpperCase();
        System.out.println(upperCase);

        String lowerCase=phrase1.toLowerCase();
        System.out.println(lowerCase);

        System.out.println("**************************************************************");
        System.out.println("String format,string, numbers");

        String name="Sushil";
        Integer age=30;

        // %s for String
        // %d for int
        String message=String.format("Hello , %s! you are %d year old",name,age);
        System.out.println(message);

        double price=1234.456;
        String formatPrice=String.format("the price is $%.3f",price);
        System.out.println(formatPrice);

        System.out.println("**************************************************************");
        System.out.println("Operator Precedence and Associativity");

        int a=10;
        int b=5;
        int c=2;
        int result=a+b*c;  // result will be 20
        System.out.println(result);

        int result1=(a+b)*c;
        System.out.println(result1);

    }


}
