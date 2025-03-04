public class _16_OOP {
    public static void main(String[] args)
    {
        // OOP  oop orginize code using objects represeting real-world entiites with properties and behaviour.
        // java uses oop for intutive, reusable and maintainable code.
        /*
        class A class is a blueprint for objects , defining attributes and method

        creating a class
        public class Car{} declares the car class
        object  an object is an instance of a class with unique attibutes value

         */
        // use method by object
        Car myCarTyota=new Car();
        myCarTyota.color="Red";
        myCarTyota.model="Swift";
        myCarTyota.year=2024;
        myCarTyota.showDetails();




        System.out.println("********Second Example ********** ");
        SmartDevice smartDevice1=new SmartDevice(); // called parameterized constructor

        SmartDevice smartDevice=new SmartDevice("honor","v3"); // called parameterized constructor

        System.out.println("***Constructor without parameter***");
        smartDevice1.displayStatus();
        System.out.println("***Constructor with parameter***");
        smartDevice.displayStatus();

        //smartDevice.displayStatus();  // here is vaalue of brand and model will show null
        smartDevice.brand="Samsung";
        smartDevice.model="Galaxy S3";
        smartDevice.batteryLife=0;
        smartDevice.isConnected=true;

      //  smartDevice.displayStatus();
      //  smartDevice.connect();
      //  smartDevice.disconnect();

    // constructor
        /*
        constructor does not return anything and also does not use the void keyword
         */

    }




}
