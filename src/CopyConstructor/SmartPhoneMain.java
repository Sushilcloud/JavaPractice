package CopyConstructor;

public class SmartPhoneMain {
    public static void main(String[] args)
    {
        SmartPhone smartPhone1=new SmartPhone("S3","Samsung",1500);
        SmartPhone smartPhone2=new SmartPhone("v3","honor",1200);
        SmartPhone smartPhone3=new SmartPhone(smartPhone2);

        smartPhone3.displayDetails();
        smartPhone2.displayDetails();
        smartPhone2.Shivansh();

    }
}
