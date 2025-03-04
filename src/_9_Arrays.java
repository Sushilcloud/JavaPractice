public class _9_Arrays {
    public static void main(String[] arg)
    {
        /*
        Arrays: An array in java stores multiple values of the same type, accessed by index.
                useful for loops and random access

        Declaring and initializing Arrays:
            a:  Declaring:    Specify type and name with []
            b:  initializing: Use new keyword and size.
            c:  with value:   Initializing with specific value at declaration.

        Accessing and Processing Arrays

            Accessing Arrays Element. Use the index (starting from 0) to retrieve and modify element.
            Looping through Arrays:
                for loop:       iterate using an index counter.
                for-each loop:  Simplifies iteration , handling indexing automatically

             Common Array operation
                Length: Use length to get the number of element in an array.
         */

        int[] numbers; //declaring the array but not taking space
        numbers=new int[5]; //initializing

        int[] num2={1,2,3,4,5,6};

        int firstNum=numbers[0];

        System.out.println(firstNum);
        System.out.println(num2[2]); // result 3 at position 0 1 2
        // Array length

        int[] aa={1,2,3,4,5};
        System.out.println("Array length is "+aa.length);
        int k=aa.length;
        for(int i=0;i<k;i++)
        {
        System.out.println(aa[i]);
        }

    }
}
