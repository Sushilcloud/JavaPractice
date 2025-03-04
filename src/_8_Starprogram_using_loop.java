public class _8_Starprogram_using_loop {
    public static void main(String[] arg)
    {
        for(int i=0;i<=10;i++){
            System.out.print("*");  //***********
        }

        for(int j=0;j<=5;j++) {
            for(int k=0;k<=j;k++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
            /*
            Result below
             *
             *
             *
             *

             */



    }
}
