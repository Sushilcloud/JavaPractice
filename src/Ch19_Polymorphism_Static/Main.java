package Ch19_Polymorphism_Static;

public class Main {
    public static void main(String[] args)
    {
        // compile time polymorphism static polymorphism  static overloading
        Calculator calculator=new Calculator();
        int sum1=calculator.add(5,3);  // method overloading for different parameter
        System.out.println(sum1);
       double sum2= calculator.add(10.5,3.2);
        System.out.println(sum2);
     int sum3=   calculator.add(2,2,2);
        System.out.println(sum3);
    }
}
