public class _9_Arrays_sum_min_max {
    public static void main(String[] args)
    {



        int[] numbers={1,2,3,4,5,6,7};
        // sum of arrays
        int sum=0;
        // for min and max
        int max=numbers[0];
        int min=numbers[0];
        for(int number :numbers){
            // for min and max
            if(number>max){
                max=number;
            }
            if(number<min){
                min=number;
            }
            // for sum of array
            sum+=number;

        }
        System.out.println("Sum of arrays"+sum);
        System.out.println("Max number in arrays"+max);
        System.out.println("Max number in arrays"+min);


    }
}
