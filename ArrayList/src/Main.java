import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> fruit=new ArrayList<>();
        fruit.add("Apple");
        fruit.add("Mango");
        fruit.add("Banana");
        System.out.println("Firt fruit is "+fruit.get(0));

        for (String frt : fruit )
        {
            System.out.println(frt);
        }
    }
}