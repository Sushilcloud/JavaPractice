import java.util.Arrays;

public class _11_Method_PassByValue_PassByRef {
    public static void main(String[] args)
    {
        // for array
        int[] originalArray={1,2,3,4};
        System.out.println("before Method call,"+"originalArray[0]:"+originalArray[0]);
        modifyArray(originalArray);
        System.out.println("After Method call,"+"originalArray[0]:"+originalArray[0]);




        int originalNumber=10; // we cant change the original number value
        modifyPrimitive(originalNumber);
        System.out.println("After method call , original number"+originalNumber);
    }
    public static void modifyPrimitive(int number)
    {
        number=20;
        System.out.println("Inside number, number"+number);
    }

    public static void modifyArray(int[] array){
        array[0]=99;
        System.out.println("Inside method array[0]"+array[0]);
    }
}
