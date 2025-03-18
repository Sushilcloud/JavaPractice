 package CopyConstructor;

public class SmartPhone {
    private String model;
    private String brand;
    private double price;

    // create a copy constructor of smart phone

    public SmartPhone(SmartPhone mySmartphone)
    {
        this.model=mySmartphone.model;
        this.brand=mySmartphone.brand;
        this.price=mySmartphone.price;
    }


    // Parameterized Constructor
    public SmartPhone(String model, String brand, double price)
    {
        this.model=model;
        this.brand=brand;
        this.price=price;
    }
   public void display()
   {
       System.out.println("hi this is sushil");
   }


    public void displayDetails()
    {
        System.out.println("Model"+model);
        System.out.println("Brand"+brand);
        System.out.println("Price"+price);

    }

    public void Shivansh()
    {
        System.out.println("Hi this is shivansh");
    }
    public void applyDiscount()
    {

    }

}
