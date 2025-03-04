public class _9_Arrays_Rearranging_Arrays {
    public static void main(String[] args)
    {
        int[] nums={2,5,1,3,4,7};
        // 2,3,5,4,1,7
        int n=nums.length/2;
        // create new array list with same length
        int[] rearranged=new int[nums.length];
        for(int i=0;i<n;i++)
        {
            rearranged[2*i]=nums[i];
            rearranged[2*i+1]=nums[i+n];
        }
        System.out.println("Rearranged arrays is");
        for(int i:rearranged)
        {
            System.out.print(i);
        }


    }
}
