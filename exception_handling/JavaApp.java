package exception_handling;
import java.util.Scanner;
import java.util.ArrayList;

public class JavaApp {
	 public static void execution() {


    /*/ Method that demonstrates handling of different runtime exceptions
   

        // Creating Scanner object to take input from the user
        Scanner sc = new Scanner(System.in);

        try {

            // Asking user to enter ID
            System.out.println("Enter your ID: ");
            int id = sc.nextInt();

            // Consuming the leftover newline character after nextInt()
            sc.nextLine();

            // Asking user to enter name
            System.out.println("Enter your name: ");
            String name = sc.nextLine();

            // Displaying the entered ID and name
            System.out.println("ID: " + id);
            System.out.println("Name: " + name);

        }

        // Catch block to handle invalid input or other runtime exceptions
        catch(Throwable throwable) {

            // Prints detailed exception information for debugging
            throwable.printStackTrace();

            // Displays user-friendly error message
            System.out.println("Invalid input");
        }

        // Finally block used to close the Scanner resource
        finally {

            // Closing the Scanner object to release system resources
            sc.close();

            // Confirmation message that resource has been closed
            System.out.println("Resource Closed");
        }

        try {

            // Creating an ArrayList to store Integer values
            ArrayList<Integer> a1 = new ArrayList<Integer>();

            // Adding elements from 0 to 5 into the ArrayList
            for (int i = 0; i <= 5; i++) {
                a1.add(i);
            }

            // Attempting to print all elements of the ArrayList
            // Using <= a1.size() will cause IndexOutOfBoundsException
            // because the last valid index is size() - 1
            for (int i = 0; i <= a1.size(); i++) {
                System.out.println(a1.get(i));
            }

            // Declaring an integer array of size 5
            int[] array = new int[5];
            int data = 1;

            // Populating the array with values from 1 to 5
            for (int i = 0; i < array.length; i++) {
                array[i] = data;
                data++;
            }

            // Attempting to print array elements
            // Using <= array.length will cause ArrayIndexOutOfBoundsException
            // because the last valid index is array.length - 1
            for (int i = 0; i <= array.length; i++) {
                System.out.println(array[i]);
            }

            // Creating a string object
            String string = "java";

            // Attempting to print each character of the string
            // Using <= string.length() will cause StringIndexOutOfBoundsException
            // because the last valid index is string.length() - 1
            for (int i = 0; i <= string.length(); i++) {
                System.out.println(string.charAt(i));
            }

        }

        // Catch block to handle exceptions generated in the above code
        // Throwable is the superclass of both Exception and Error
        catch (Throwable throwable) {

            // Prints the stack trace of the exception for debugging purposes
            throwable.printStackTrace();

            // Displays a message indicating that the exception has been handled
            System.out.println("Exception handled");
        }
        */
		// Creating a Student object with id, name, email, and contact number
		 Student student = new Student(1, "Arya", "123@gmail.com", 123395640);

		 try {
		     
		     // Calling verifier() method from DB class
		     // This method is expected to verify whether the Student object is valid
		     DB.verifier(student);
		 }

		 catch(Throwable throwable) {

		     // Printing the stack trace of the exception for debugging purposes
		     throwable.printStackTrace();

		     // Displaying a user-friendly message if the Student object is not valid
		     System.out.println("Student object not found! Please pass a valid object.");
		 }
}
}