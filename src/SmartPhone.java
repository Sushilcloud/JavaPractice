public class SmartPhone {
    String applianceName;
    String applianceType;
    String powerStatus;
    public SmartPhone(String applianceName,String applianceType,String powerStatus)
    {
        this.applianceName=applianceName; //this.Datamemeber of class= parameter of constructor
        this.applianceType=applianceType;
        this.powerStatus=powerStatus;
    }

    public SmartPhone getInstance()
    {
        return this;

    }
    public void displayDetails()
    {
        System.out.println("Appliance Name"+applianceName);
        System.out.println("Appliance Type"+applianceType);
        System.out.println("Power Status"+powerStatus);

    }
}
