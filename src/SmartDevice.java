public class SmartDevice {
    // having some properties

    //member variable (filed) outside method
    // member variable store the state of an object
    String brand;
    String model;
    int batteryLife=0;
    boolean isConnected=false;
    // Constructor non Parameterized
    public SmartDevice()
    {
        System.out.println("Smart Device created");
        brand="Unknown";
        model="Unknown";

    }

    // Constructor parameteriozed
    public SmartDevice(String myBrand,String myModel)
    {
        brand=myBrand;
        model=myModel;
    }



    // member method define the action or behaviour of an object
    void connect()
    {
        isConnected=true;
    }
    void disconnect()
    {
        isConnected=false;
    }

    // method in class file
    void displayStatus()
    {
        System.out.println("Brand"+brand);
        System.out.println("model"+model);
        System.out.println("Battery Life"+batteryLife);
        System.out.println("Connected"+isConnected);

    }
}
