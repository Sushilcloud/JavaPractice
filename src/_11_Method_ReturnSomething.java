public class _11_Method_ReturnSomething {
    public static void main(String[] args)
    {

        int num=add(5,3);
        System.out.println("add of two variable"+num);
    }

    public static int add(int num1,int num2)
    {
        int reulst=num1+num2;
        return reulst;
    }
}
