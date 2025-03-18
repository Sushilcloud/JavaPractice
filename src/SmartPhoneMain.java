public class SmartPhoneMain {
    public static void main(String[] args)
    {
        SmartPhone smartPhone=new SmartPhone("Air Conditionere","Cooling","On");

        // we are creating new instance
        SmartPhone smartPhone1=smartPhone.getInstance();

        // we are just creating a reference to he other object
        SmartPhone smartPhone2=smartPhone;

        smartPhone1.applianceName="Air Cond";
        smartPhone1.displayDetails();
    }
}
