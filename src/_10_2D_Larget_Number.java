public class _10_2D_Larget_Number {
    public static void main(String[] arg)
    {

        int[][] my2dArray={{1,2,3},{4,5,6},{7,8,9,10,11,12,13}};

        int largestValue=my2dArray[0][0];
        int lowestValue=my2dArray[0][0];

        //iterate through row
        for(int[] rows: my2dArray) {
            // iterate through column
            for(int num :rows) {
                if(num > largestValue){
                        largestValue=num;
                }
                if(num<lowestValue)
                {
                    lowestValue=num;
                }
            }
        }
        System.out.println("Largest value is=="+largestValue);
        System.out.println("Largest value is=="+lowestValue);

    }
}
