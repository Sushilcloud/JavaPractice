
class A
{
    public void sushil()
    {

        System.out.println("Hi i am method sushil from class A");
    }

    public void math2()
    {
        System.out.println("i am method 2 of class A");
    }
}
class B extends A{
    public void meth3()
    {
        System.out.println("i am method 3 of class B");
    }
    public void math2()
    {
        System.out.println("i am method 2 of class B");
    }
}

public class _Method_Overriding {

    public static void main(String[] args)
    {
        A a=new A();
        a.math2();
       // a.sushil();

        B b=new B();
       // b.meth3();
        b.math2();
        b.sushil();

    }



}
