public class Ch17_UsingObjectasParameterMain {
    public static void main(String[] args)
    {
        Ch17_UsingObjectasParameter smartPhone1= new Ch17_UsingObjectasParameter("Magic V3","Honor",1800);
        Ch17_UsingObjectasParameter smartPhone2=new Ch17_UsingObjectasParameter("Galaxy","Samsung",200);

        smartPhone1.applyDiscount(10);
        smartPhone2.comparePrice(smartPhone1);

    }
}
