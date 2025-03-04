import java.util.Random;

public class _11_Method_RandomNumber {
    public static void main(String[] args)
    {
        Random random=new Random();
        int myRandom1=random.nextInt(); // Any value
        int myRandom2=random.nextInt(100); // less than 100
        int myRandom3=random.nextInt(100,200); // betweek 100 and 200
        System.out.println("Any value"+myRandom1);
        System.out.println("Less than 100="+myRandom2);
        System.out.println("betweek 100 and 200="+myRandom3);

    }
}
