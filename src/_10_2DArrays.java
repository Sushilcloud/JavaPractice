import java.util.Arrays;

public class _10_2DArrays {
    public static void main(String[] arg)
    {
        /*
        2D Arrays   :   Arrays of array visualized with row and column, access element using row and column indices,Useful for
                        Matrices , tables and grids.

        Creating and initilizing :  Specify row and column , declare the array type with square bracket , allocate memory
                        and optionally assign initial values.

        Syntax      :   a   int[][] array=new int[2][2] // create 2*2 array mean 2 row and 2 column
                        b   int[][] array={{1,2,3},{2,3,4},{4,4,5}}; // create and initilize a 3*3array with values
         */

        int[][] sushil=new int[2][2];
        sushil[0][0]=1;
        sushil[0][1]=2;
        sushil[1][1]=3;
        sushil[1][0]=4;

        System.out.println(sushil[0][0]);
        System.out.println(sushil[0][1]);
        System.out.println(sushil[1][1]);
        System.out.println(sushil[1][0]);


        for(int i=0;i<sushil.length;i++)
        {
            for(int j=0;j< sushil.length;j++) {
                System.out.print(sushil[i][j]+" ");
            }
            System.out.println();
        }

       // enhance for loop
        System.out.println("Enhance for loop");
       for(int[] row:sushil){
           for(int ant:row)
           {
               System.out.print(ant+" ");
           }
           System.out.println();

       }




    }
}
