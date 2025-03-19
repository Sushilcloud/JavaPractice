package Interfaces;

public interface InterfaceName {

    // constant
    int CONSTANT=10;

    // abstract method
    void methodName();


    // default method
    default void defaultMethod(){
        System.out.println("Default implementation");
    }

    // static method
    static void staticMethod()
    {
        System.out.println("Static Implementation");
    }
}
