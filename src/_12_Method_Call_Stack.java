public class _12_Method_Call_Stack {
    public static void main(String[] args)
    {
    makeSandwich();
        // stack    LIFO(Last in first out)

    }

    public static void buyBread()
    {
        System.out.println("Bought two slice of bread");
    }
    public static void getSliceofBread()
    {
        buyBread();
        System.out.println("Got two slice of bread");
    }
    public static void spreadJelly()
    {
        System.out.println("Spread jelly on the other side");
    }
    public static void putSliceTogether()
    {
        System.out.println("Put slice together");
    }

    public static void makeSandwich()
    {
        getSliceofBread();
        spreadJelly();
        putSliceTogether();
        System.out.println("Sandwich is ready");
    }
}
