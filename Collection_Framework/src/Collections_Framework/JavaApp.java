package Collections_Framework;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Iterator;

public class JavaApp {
	
	// Method demonstrating various operations of ArrayList and iterators
	public static void execution() {
		// Creating a generic ArrayList to store Integer values
		ArrayList<Integer> arr = new ArrayList<Integer>();    
		// Adding elements to the ArrayList
		arr.add(1);
		arr.add(-2);
		arr.add(-7);
		arr.add(9);
		arr.add(3);
		System.out.println(arr);
		
		// Inserting element at a specific index (index 0)
		arr.add(0,9);
		System.out.println(arr);
		
		// Adding an element at the beginning of the list
		arr.addFirst(90);
		System.out.println(arr);
		
		// Adding an element at the end of the list
		arr.addLast(78);
		System.out.println(arr);
		
		arr.set(4, 77);
		System.out.println(arr);
		
		arr.remove(3);
		System.out.println(arr);
		
		// ---------------- Iterator Traversal ----------------
		System.out.println("iterator method");
		
		// Using Iterator to traverse the ArrayList in forward direction
		Iterator<Integer> iterator = arr.iterator();
		while(iterator.hasNext()){
			// hasNext() checks if another element exists
			// next() returns the next element
			System.out.println(iterator.next());
		}
		
		// ---------------- ListIterator Traversal ----------------
		
		// Creating ListIterator starting from index 8
		ListIterator<Integer> listIterator = arr.listIterator(7);
		System.out.println("Backward");
		
		// Traversing the list in backward direction
		while(listIterator.hasPrevious()) {
			System.out.println(listIterator.previous());
		}
		
		
		// ---------------- Cloning ArrayList ----------------
		// Creating a shallow copy of arr using clone()
		ArrayList<Integer> arr2 = (ArrayList<Integer>)arr.clone();
		
		// ---------------- Non-Generic Collection Example ----------------
		// Creating a non-generic ArrayList that can store multiple data types
		ArrayList a1 = new ArrayList();
		a1.add(1);
		a1.add(43);
		a1.add(23.87);
		a1.add(1);
		a1.add(1);
		a1.add("java");
		a1.add(true);
		a1.add(null);
		a1.add(null);
		a1.add(null);
		a1.add(null);
		System.out.println(a1);
		
		
		System.out.println(arr2);		
		System.out.println(arr.hashCode());
		System.out.println(arr2.hashCode());
		
		System.out.println(arr.equals(arr2));
		
	}

}
