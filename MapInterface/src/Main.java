import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        // Map Interface
        /*
        the map interface stores key-value pairs with unique keys , making it ideal for linking identifiers
        to data.

        characteristics:
        key-value pairs: Easy value lookup via keys.
        Unique keys no duplicate keys allowed
        Multiple implementation: includes HashMap, TreeMap and LinkedHashMap, each with distinct behaviour

        Common Method in Map
        Put (key,value)
        get(object key)
        remove(object key)
        containsKey(Object key)
        ContainsValue(Object Value)
        Size()
        Clear()

        HashMap



         */

        Map<String, String> capitals=new HashMap<>();
        capitals.put("USA","Washingtons DC");
        capitals.put("Germany","Berlin");
        capitals.put("France","Paris");
        capitals.put("England","London");

        System.out.println("Capitals of Germany"+capitals.get("Germany")+"Capitals of France"+capitals.get("France"));

        capitals.remove("France"); // removed entry

        capitals.replace("England","Manchaester");// replace

        boolean containsIndia=capitals.containsKey("India"); //
        System.out.println(containsIndia); //

        for(Map.Entry<String,String> entry :capitals.entrySet())
        {
            System.out.println("Country: "+entry.getKey()+", Capital: "+entry.getValue());
        }






    }
}