public class _3Operators {
    public static void main(String[] args)
    {
        // Common Operators
        // Operators: Special sybmols that perform operations on variable and values

        /* 1    Expressions: Combinations of variables, operators and values that produce a result . for example ,a+b ia an
                expression where a and b are variables and +is an operators.

           2    Arthematic Operators: Perform basic arthematic operation ==Addition(+) , Subtract(-), multiply(*)
                Division(/), Modulus(%)

           3    Unary Operators:    Operator on a single operand -Unary plus(+), Unary minus(-), Post-increment(a++),
                Pre-increment(++a), Post-decrement(a--), Pre-decrement(--a).

           4    Relational Operators:   Perform relational comparisions:
                Equal to (==)
                not Equal to(!=)
                Greator than(>)
                Less than(<)
                Greator than or equal to (>=)
                Less than or equal to(<=)


           5    Logical Operators   Perform logical comparisions ;
                AND(&&)
                OR(||)
                NOT(!)

           6    Short Circuit Logical Operators Use short circuit evaluation where the second operand is evaluated only if
                necessary.
                example: int a =5, int b=10; boolean result =(a>0) && (b<15) // result is true


            ASSIGNMENT OPERATORS

            1   Simple Assignment           =   Assign right value to left Symbol =. Example a =5;
            2   Addition Assignment         =   Adds right value to left variable. Symbol: +=. Example. a+=5;
            3   Subtraction Assignment      =   Subtract right value from left variable. Symbol. -=. Example a-=5;
            4   Multiplication Assignment   =   Multiplies left variable by right value. Symbol.*=. Example a*=5;
            5   Division Assignment         =   Divides left variable by right value. Symbol /=. Example a/=5;
            6   Modulus Assignment          =   Assigns reminder of left variable divided by right value. Symbol %=. a%=5;



        */

    System.out.println("Arthematic operators");
    int a,b, result;
    a=10;
    b=5;
    result=a+b;
    System.out.println("Sum of two number is ="+result);
    result=a-b;
    System.out.println("Subtraction of two number ="+result);
    result=a*b;
    System.out.println("multiply of two number ="+result);
    result=a/b;
    System.out.println("Division of two number ="+result);

    // Modulo operator %
        result=a%b;

        System.out.println("Modulo of two number ="+result);


    // UNARY OPERATORS
    int aa=5;
    int negative =-aa;
    int positive =+aa;
    System.out.println("Unary operator= "+negative);
    System.out.println("Unary operator= "+positive);

    int bb=++aa;
    System.out.println("Increment operator= "+bb);

    int cc=--aa;
    System.out.println("Decrement operator= "+cc);

    // BOOLEAN
        int p=5;
        int q=10;
        boolean result1 =p>q;
        System.out.println(result1);

        result1 =p<q;
        System.out.println(result1);

        result1 =p==q;
        System.out.println(result1);

        result1 =p!=q;
        System.out.println(result1);


    // COMPOUND OPERATORS


    }


}
