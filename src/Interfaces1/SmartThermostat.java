package Interfaces1;

public class SmartThermostat implements ControllableDevice{

    private boolean isOn=false;
    private double temp=72.0;

    @Override
    public void turnOn() {
    isOn=true;
        System.out.println("Smart Thermostat is turned on");
    }

    @Override
    public void turnOff() {
    isOn=false;
        System.out.println("smart thermo state is turned off");
    }

    @Override
    public void getStatus() {
        String status=isOn?"On":"Offf";
        System.out.println("Smart Thermostat status "+status+"temp"+temp+"C");
    }

    public void setTemp(double temp)
    {
        this.temp=temp;
        System.out.println("Temperatur set to "+temp);
    }
}
