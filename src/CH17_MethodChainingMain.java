public class CH17_MethodChainingMain {
    public static void main(String[] args)
    {

        // create a object to get class
        Ch17_MethodChaining appliance1=new Ch17_MethodChaining("Air Conditioner","Cooling",
                "On");

        // we are creating a new instance
        Ch17_MethodChaining appliance2=appliance1.getInstance();

        // we are just creating a referance to the other object
        Ch17_MethodChaining appliance3=appliance1;

        appliance1.setApplianceName("Sushil Godiyal").setApplianceType("Human").setPowerStatus("On Always");

        appliance2.displaydetails();
        System.out.println("---------------");
        appliance1.displaydetails();

    }
}
