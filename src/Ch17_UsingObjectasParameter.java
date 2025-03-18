public class Ch17_UsingObjectasParameter {
    private String model;
    private String brand;
    private double price;

    // create a constructor
    public Ch17_UsingObjectasParameter(String model, String brand, double price)
    {
        this.model=model;
        this.brand=brand;
        this.price=price;


    }
    // create a method
    public void applyDiscount(double discountPercentage)
    {
        this.price-=this.price*(discountPercentage/100);
        System.out.println("After Discount price will be"+price);
    }

    public void comparePrice(Ch17_UsingObjectasParameter otherSmartPhone)
    {
        if(this.price<otherSmartPhone.price) {
            System.out.println(this.model + "is cheaper thank" + otherSmartPhone.model);
        }
        else if(this.price>otherSmartPhone.price) {
            System.out.println(this.model + " is more expensive than" + otherSmartPhone.model);
        }
        else {
            System.out.println(this.model+"is as expensive as"+otherSmartPhone.model);
        }
    }

    public void displayDetails()
    {
        System.out.println("Model"+model);
        System.out.println("Brand"+brand);
        System.out.println("Price"+price);
    }


}
