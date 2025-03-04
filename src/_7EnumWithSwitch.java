public class _7EnumWithSwitch {
    public enum Day{
        MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY,SUNDAY
    }
    public enum CoeffeSize{
        SMALL,MEDIUM,LARGE,VENTI
    }

    public static void main(String[] arg){

        CoeffeSize size=CoeffeSize.LARGE;
        double prize;
        switch (size){
            case SMALL:
                prize=2.5;
                break;

            case MEDIUM:
                prize=3.5;
                break;

            case LARGE:
                prize=4.5;
                break;

            case VENTI:
                prize=5.5;
                break;

            default:
                prize=10.5;
                break;
        }
System.out.println("The prize of your coeffe"+prize);

    }
}
