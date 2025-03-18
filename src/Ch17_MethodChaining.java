public class Ch17_MethodChaining {

    // create below varaiable as private
    private String applianceName;
    private String applianceType;
    private String powerStatus;

    // constructor
    public Ch17_MethodChaining(String applianceName, String applianceType, String powerStatus)
    {
        this.applianceName=applianceName;
        this.applianceType=applianceType;
        this.powerStatus=powerStatus;

    }

    public Ch17_MethodChaining getInstance()
    {
        return this;
    }

    public Ch17_MethodChaining setApplianceName(String applianceName) {
        this.applianceName = applianceName;
        return this;
    }

    public Ch17_MethodChaining setApplianceType(String applianceType) {
        this.applianceType = applianceType;
        return this;
    }

    public Ch17_MethodChaining setPowerStatus(String powerStatus) {
        this.powerStatus = powerStatus;
        return this;
    }

    //method to print details
    public void displaydetails()
    {
        System.out.println("Appliance Name"+applianceName);
        System.out.println("Appliance Type"+applianceType);
        System.out.println("Power Statsu"+powerStatus);
    }
}
