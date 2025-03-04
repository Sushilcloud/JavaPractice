import java.util.Arrays;

public class _9_Arrays_Class_and_common_method {
    public static void main(String[] args){
        /*
        Definition: The arrays class in java,part of java.util offers static method for easy and efficient array manipulation

        Importing the arrays class
           a     To use the array class, import it with : import java.util.Arrays;
           b     This allows access to its helpful methods

        Commonly used Methods in Arrays Class

            Arrays.toSting()        : Convert an arrays to a readable string format for easy display and debugging.
            Arrays.sort()           : Sorts the arrays element in ascending order,simplifying the sorting process
            Arrays.binarySearch()   : Searches for a value in a sorted array, returning its index or a negative numbers
                                      if not found.
            Arrays.copyOf()         : Creates a copy of an arrays with a specified new length , truncating or padding as needed
            Arrays.fill()           : Fills an array with a specified value ,usefull for initializing or resetting.
            Arrays.equals()         : Compares two arrays to check if they contain the same elements in the same order

         */

    //****************Arrays toString and sort Method**********************//
        System.out.println("************Arrays toString and sort Method**************");
        int[] nums={0,2,3,1,5,3,7,12,9};
        String[] names={"susil","kamlesh","ravi","harsh","mahes"};
        System.out.println(Arrays.toString(nums));
        System.out.println(Arrays.toString(names));

        // sort method
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));

        // sort for names
        Arrays.sort(names);
        System.out.println(Arrays.toString(names));

        //****************Arrays bineary search**********************//

        int[] numss={2,3,4,5,3,6,8,4,3};
        Arrays.sort(numss);
        System.out.println(Arrays.toString(numss));
        int index=Arrays.binarySearch(numss,6);
        System.out.println("Index at 6 is at"+index);

        //****************Copyof    and by value vs by reference**********************//
        System.out.println("****Copyof and by value vs by reference***");
        int[] aa={2,4,5,3,7,8,4,9};
        System.out.println("Before sort of aa="+Arrays.toString(aa));
        int[] backupofaa=aa; // by refernce
        Arrays.sort(aa); // sort the array
        System.out.println("After sort of aa="+Arrays.toString(aa));
        System.out.println("Back up of aa"+Arrays.toString(backupofaa)); // which also sorted

        int[] actualbackupaa=Arrays.copyOf(backupofaa,backupofaa.length);
        System.out.println("ActualBackupaa"+Arrays.toString(actualbackupaa));

        //****************Array fill and equals**********************//

        int[] ap=new int[5];
        int[] aq=new int[5];
        int[] ar=new int[5];

        Arrays.fill(ap,10);
        System.out.println(Arrays.toString(ap)); // fill all value with zero from 0 to 5th index
        Arrays.fill(aq,0,3,10);
        System.out.println(Arrays.toString(aq)); // fill all value with zero from 0 to 5th index

        System.out.println(Arrays.equals(ap,aq)); // check two arrys equals?
    }
}
