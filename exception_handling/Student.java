package exception_handling;

// Student class representing a student entity
public class Student {

    // Instance variables storing student details
    int id;
    String name;
    String mailId;
    long contactNumber;

    // Parameterized constructor used to initialize student object
    public Student(int id, String name, String mailId, long contactNumber) {
        this.id = id;                  // Assigning student id
        this.name = name;              // Assigning student name
        this.mailId = mailId;          // Assigning student email id
        this.contactNumber = contactNumber; // Assigning student contact number
    }

    // Overriding toString() method to provide meaningful string representation
    // of the Student object when it is printed
    public String toString() {
        return "Student [id=" + id + ", name=" + name + ", mailId=" + mailId + ", contactNumber=" + contactNumber + "]";
    }

}
