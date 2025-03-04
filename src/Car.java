public class Car {
    String color;
    String model;
    int year;

    // method in class file
    public void showDetails()
    {
        System.out.println("This car is"+color+"Model is"+model+"and year of manufactured is "+year);
    }

    void Drive(){
        System.out.println("Driving");
    }

    private void Mode(){  // not accessible
        System.out.println("This is private method");
    }
}
