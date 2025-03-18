package Ch18_Access_Specifier_Package2;

import Ch18_Access_Specifier_Package1.Parent;

public class DifferentPackageChild extends Parent {
    public void accessProtectedMethod()
    {
        protectedMethod();
    }

    public static void main(String[] args)
    {
        DifferentPackageChild child=new DifferentPackageChild();
        child.accessProtectedMethod();
    }
}
