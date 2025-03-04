public class Main {
    public static void main(String[] args)
    {
        System.out.println("Hi Sushil ");
        System.out.println("Hello world!");
        System.out.print("Godiyal");

        // declaring and assigning variable

    int age;//declaring a variable
    age=36; // assigning a value
    int weight=74; // declaring and assigning
    System.out.println(age);
    System.out.println("Age is "+age);
    System.out.println(weight);


    // data type

        // primitive data types
        // byte, short ,int, long
        // byte 8 bit
    byte a=127;
    byte aa=-128;

    // limitation of range data type byte is range from -128 to 127

    //short 16 bit storage is equal to 2 power of 16=65536 divide by 2 equal to 32768 mean
        short b=32767;
        short bb=-32768;

        // int 32 bits mean 2 power of 32 =4294967296

        int c=2147483647;
        int cc=-2147483648;

        // long 64 bits


        // decimal point
        // float only 32 bits
        // double require 64 bits

        float temp=16.5F;// type F end of the value required in have by default its convert in to double
        // if we will not write it then it will show error message because doble value will not store in float variable

        // doubel 64 bits
        double pi=3.14159265;

        // char
        char myChar='A';
        System.out.println(myChar);

        // boolean true and false

        boolean isJavaCool=true;
        isJavaCool=false;
        System.out.println(isJavaCool);

        // string data type

        String p="hello java";
        System.out.println(p);


        // declaring varibale at once
        int ac , bd , cs ,ds ;
        ac=35;
        bd=25;
        cs=77;
        ds=55;
        //System.out.println(ac+bd+cs+ds);
        String name,group;
        name="lokesh";
        group="college";
        System.out.println(name+group);


        // type casting
        // involve when one data type to another

        // widening conversion(implicit casting) it is automatically with no data loss when assigning a samller to larget type

        // Narrowing Conversion (Explicit casting)its require explicit casting and may result in data loss when assigning a larger to smaller type.

        int numInt=10;
        System.out.println(numInt);
        double numDouble=numInt;
        System.out.println(numDouble); // implicit casting fron int to double

        // Explicit casting
        double mDouble=3.2;
        int numInt1=(int) mDouble;
        System.out.println(numInt1); // we will loose here addition decimal point

    }
}