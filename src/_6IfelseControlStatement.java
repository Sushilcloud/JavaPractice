public class _6IfelseControlStatement {
    public static void main(String[] arg){
        int number=20;
        if(number>10){
        System.out.println("Number is greater than 10");
        }
        else{

            System.out.println("Number is less than 10");
        }

        // nested if else
        int a=0;
        if(a>2){
            System.out.println("a is greater than 2");
        }else{
            if(a<2){
                System.out.println("a is less than 2");
            }
            else {
                System.out.println("a is equal to 0");
            }
        }

        // if else if else

    /*  if(condition)   {}
        else if(condition2) {}
        else if(condition3) {}
        else if(condition4) {}
        else if(condition5) {}
        else{}


     */

        // Ternary Operator
        int age=21;
        //             Condtion ?expression1 : expression2
        double discount=(age<18) ?.10:.05;
        System.out.println("Discount is "+discount*100+"%");

        int score=85;
        char grad=(score>=90)? 'A'
                :(score>=80)? 'B'
                :(score>=70)? 'C'
                :(score>=60)? 'D'
                :(score>=50)? 'E'
                : 'F';
        System.out.println("The Grade is "+grad);


    }
}

