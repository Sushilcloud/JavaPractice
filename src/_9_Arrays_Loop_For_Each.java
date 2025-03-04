public class _9_Arrays_Loop_For_Each {
    public static void main(String[] args){

        int[] numbers={1,12,14,15,16,17};
        System.out.println("Array length is"+numbers.length);
        int counter=0;
        for(int number:numbers){
            System.out.print("Counter is "+counter+++"=");
            System.out.println(number);
        }


        String[] friends={"Sushil","Jugnu","Ravi","Manoj","shyam","Harsh"};
        for(String friend:friends){
        System.out.println("My Friend are "+friend);
        }
    }
}
