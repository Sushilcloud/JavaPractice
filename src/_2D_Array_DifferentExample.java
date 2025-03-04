import java.util.Arrays;

public class _2D_Array_DifferentExample {
    public static void main(String[] args)
    {
        System.out.println("***how to print an arrays********");
        int[] mar={1,2,3};
        int[][] mar1={{1,2,3},{4,5,6}};

        int[][] marks={{11,12,13},{20,10,10}};
        int[][] marks1=new int[][]{{11,12,13},{20,10,10}};

        System.out.println(Arrays.toString(mar)); //[1, 2, 3] output
        System.out.println(Arrays.toString(mar1)); //[[I@4dd8dc3, [I@6d03e736]
        System.out.println(Arrays.deepToString(mar1)); //[[1, 2, 3], [4, 5, 6]]


        System.out.println(Arrays.toString(marks)); //[[I@4dd8dc3, [I@6d03e736] output
        System.out.println(Arrays.toString(marks1)); //[[I@568db2f2, [I@378bf509] output
        System.out.println(Arrays.deepToString(marks1)); //[[11, 12, 13], [20, 10, 10]] output

        System.out.println("***Loop an arrays********");

        for(int[] m: marks){
            System.out.println(m);
        }




    }
}
