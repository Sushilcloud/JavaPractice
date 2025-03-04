public class _11_MethodsandUses {

    // method to sum of two number
    public static void sum(int a, int b)
    {
        int c=a+b;
        System.out.println(c);
    }

    // method to print hello
    public static void sayHello(){
        System.out.println("Say Hello");
    }

    // void method with parameter
    public static void sayHello(String name, int age)
    {
     System.out.println("your name is "+name+" age is ="+age);
    }

    public static void main(String[] args)
    {

        sayHello(); // method should be static only
        sum(4,3);
        sayHello("sushil",34);
        //System.out.println();

    }
}
