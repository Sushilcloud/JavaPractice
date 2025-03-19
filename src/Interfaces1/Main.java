package Interfaces1;

public class Main {
    public static void main(String[] args)
    {
        ControllableDevice light=new SmartLight();

        //polymorphism going here
        ControllableDevice thermostate=new SmartThermostat();

        light.getStatus(); // by default boolean variale is false
        light.turnOn();
        light.getStatus();


        thermostate.getStatus();
        thermostate.turnOn();
        ((SmartThermostat) thermostate).setTemp(20.0);
    }
}
