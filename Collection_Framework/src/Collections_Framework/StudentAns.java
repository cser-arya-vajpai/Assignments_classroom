/**write a java program to design and develop the java application to achieve the business logic implementation of performing crud operations on 
student objects as per the end user's choice.**/
package Collections_Framework;

public class StudentAns {
	String name;
	int ID;
	int age;
	
	 StudentAns(int id, String name, int age) {
		 this.ID = id;
	     this.name = name;
	     this.age = age;
	    }
	 
	 public String toString() {
	        return "ID: " + ID + " Name: " + name + " Age: " + age;
	    }
}
