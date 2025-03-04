import java.util.Arrays;

public class _10_2D_Array_SumofAllItem {
    public static void main(String[] arg)
    {
        int[][] my2DArrays={{1,2,3},{4,5,6},{11,12,13}};
    int sum=0;
    for(int[] row: my2DArrays){
        for(int num: row){
           System.out.println(num);
           sum+=num;
        }
    }

    System.out.println(sum);
}
}
