package ClassAndObjects;

// Main class to run the program
public class Main {
	public static void main(String[] args) {
		
		// Object creation using the default constructor
		Student s1 = new Student();   
		
		// Assigning values to instance variables using the object reference
		s1.name = "arya";
		s1.rollno = 12;
		s1.marks = 100.0f;	
		
		Student s2 = new Student("arnav", 67, 89f);
		
		
		System.out.println(s2.name);
		System.out.println(s1.name);
		
	} 
}

// Student class representing a student entity
class Student {
	
	// Instance variables (attributes of the Student object)
	String name;
	int rollno;
	float marks;
	
	// Default constructor
	// Calls another constructor of the same class using 'this()'
	// This demonstrates constructor chaining
	Student() {
		this("Arya", 4, 100f);
	}
	
	// Parameterized constructor
	// Used to initialize instance variables when an object is created
	Student(String name, int rollno, float marks) {
		
		// 'this' keyword refers to the current object
		// It differentiates instance variables from constructor parameters
		this.name = name;
		this.rollno = rollno;
		this.marks = marks;
		
		System.out.println(this.name);
		
	}
}