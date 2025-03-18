package Ch18_Access_Specifier_Package2;

import Ch18_Access_Specifier_Package1.Parent;

public class TestProtected {

    public static void main(String[] args)
    {
        Parent parent=new Parent();
        parent.nonProtectedMethod(); // can access because its non protected method
        System.out.println("can not access protected method directly");
    }
}
