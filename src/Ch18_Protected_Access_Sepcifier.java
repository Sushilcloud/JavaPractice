class vechile{

    // protected method in superclass : startEngine() in vechile is protected , allowing access in the myCar subclass
    // Inheritance car inherit from vechile and accesses startEngine() due to its protected status.
    // Encapusulation startEngine() is crucial for myCar but remain hidden from non-subclass classes
    protected void startEngine()
    {
        System.out.println("Engine Started");
    }
    public void stopEngine()
    {
        System.out.println("engine stopped");
    }

}

class myCar extends vechile
{
    public void drive()

    {
        startEngine(); // we can access method because of inheritance
        stopEngine();


        System.out.println("car is driving");
    }
}


public class Ch18_Protected_Access_Sepcifier {
    public static void main(String[] args)
    {
        myCar car=new myCar(); // object created for myCar
        vechile vechile=new vechile();  // object created for vechile
        car.startEngine();  // can access method of vechile class because of inehritance even this method protected
        car.drive();  // local method of myCar class
        car.stopEngine(); //  can access method of vechile class because of inehritance even this method protected

        System.out.println("***************************");
        vechile.startEngine();
        vechile.stopEngine();

    }

}
