package Collections_Framework;
import java.util.HashSet;
import java.util.Iterator;

public class Hash {

    // Method demonstrating various operations of HashSet
    public static void hashSet() {

        // Creating a HashSet to store Character elements
        HashSet<Character> hs1 = new HashSet<Character>();

        // Adding elements to the HashSet
        // HashSet does not maintain insertion order
        // Duplicate elements are not allowed
        hs1.add('d');
        hs1.add('i');
        hs1.add('v');
        hs1.add('a');

        // Printing the HashSet
        System.out.println(hs1);

        // Cloning the HashSet hs1 into another HashSet hs2
        // clone() creates a shallow copy of the set
        HashSet<Character> hs2 = (HashSet<Character>) hs1.clone();
        System.out.println(hs2);

        // Comparing both HashSets for equality
        // equals() returns true if both sets contain the same elements
        System.out.println(hs1.equals(hs2));

        // Printing hash codes of both HashSets
        // Hash code is generated based on the elements present in the set
        System.out.println(hs1.hashCode());
        System.out.println(hs2.hashCode());

        // Creating a raw HashSet (without generics)
        // Allows storing different data types in the same set
        HashSet hs = new HashSet();

        // Adding various types of elements
        hs.add('d');
        hs.add('i');
        hs.add('v');
        hs.add(true);
        hs.add("Hey");
        hs.add(88);

        // Attempting to add duplicate element 'd'
        // HashSet ignores duplicate values
        hs.add('d');

        // Printing the HashSet containing mixed data types
        System.out.println(hs);

        // Displaying message before iteration
        System.out.println("iterator");

        // Creating an iterator to traverse the HashSet
        Iterator<Character> iterator = hs.iterator();

        // Iterating through the HashSet using Iterator
        // hasNext() checks if another element exists
        // next() retrieves the next element
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // Attempting to remove '+' from the set
        // If element does not exist, HashSet remains unchanged
        hs.remove('+');

        // Printing the HashSet after removal attempt
        System.out.println(hs);
    }

}