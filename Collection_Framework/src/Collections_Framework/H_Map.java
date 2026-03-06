package Collections_Framework;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class H_Map {

    // Method demonstrating basic operations of HashMap
    public static void hMap() {

        // Creating a HashMap with Integer as key and Double as value
        HashMap<Integer, Double> hm1 = new HashMap<Integer, Double>();

        // Adding key-value pairs using put()
        hm1.put(1, 11.11);
        hm1.put(4, 45.01);
        hm1.put(3, 31.11);
        hm1.put(2, 41.41);
        hm1.put(5, 61.15);

        // Printing the HashMap
        // Note: HashMap does not maintain insertion order
        System.out.println(hm1);

        // Creating a raw HashMap (without generics)
        // Allows storing different types of keys and values
        HashMap hm = new HashMap();

        hm.put('j', "wf");      // Character key, String value
        hm.put(3, 67.5);        // Integer key, Double value
        hm.put(12.34, "hff");   // Double key, String value

        // Printing the raw HashMap
        System.out.println(hm);

        // Creating another HashMap with Integer keys and Double values
        HashMap<Integer, Double> hm2 = new HashMap<Integer, Double>();

        // Adding elements to the HashMap
        hm2.put(2, 33.4);
        hm2.put(4, 55.7);
        hm2.put(3, 34.65);
        hm2.put(1, 54.2);

        // Retrieving all keys from the HashMap using keySet()
        Set<Integer> keys = hm2.keySet();
        System.out.println(keys);

        // Retrieving all values from the HashMap using values()
        Collection<Double> values = hm2.values();
        System.out.println(values);

        // Printing the complete HashMap
        System.out.println(hm2);

        // Replacing the value associated with key 2
        hm2.replace(2, 5.2);

        // Removing the entry with key 1
        hm2.remove(1);

        // Printing the updated HashMap after modification
        System.out.println(hm2);

        // Printing the HashMap again
        System.out.println(hm2);
    }
}
