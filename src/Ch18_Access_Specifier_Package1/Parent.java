package Ch18_Access_Specifier_Package1;

public class Parent {
    protected void protectedMethod()
    {
        System.out.println("This is a protected method");
    }
    public void nonProtectedMethod()
    {
        System.out.println("Yes can access because its not protected");
    }
}
