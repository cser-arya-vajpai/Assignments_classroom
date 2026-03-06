package Collections_Framework;
import java.util.*;

public class StudentCrud {
	public static void studentCrud() {
		Scanner sc = new Scanner(System.in);
		ArrayList<StudentAns> list = new ArrayList<>();

        System.out.print("Enter number of students: ");
		int n = sc.nextInt();
		
		for(int i=0; i<n; i++) {
			System.out.println("Enter details of student " + (i+1));
			
			System.out.println("Enter ID");
			int id = sc.nextInt();
			
			sc.nextLine();
			
			System.out.println("Enter student name: ");
			String name = sc.nextLine();
			
			System.out.println("Enter student age: ");
			int age = sc.nextInt();
			
			list.add(new StudentAns(id, name, age));
			
		}
		
		
		
		int choice;

        do {

            System.out.println("\n---- CRUD MENU ----");
            System.out.println("1. Display Students");
            System.out.println("2. Add Student");
            System.out.println("3. Update Student");
            System.out.println("4. Delete Student");
            System.out.println("5. Exit");

            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            
            switch(choice) {

            case 1:
           

                System.out.print("Enter ID to display: ");
                int displayID = sc.nextInt();

                boolean found = false;

                for(StudentAns s : list) {
                    if(s.ID == displayID) {
                        System.out.println(s);
                        found = true;
                        break;
                    }
                }

                if(!found) {
                    System.out.println("Student not found");
                }

                break;
                

            case 2:
                System.out.print("Enter ID: ");
                int id = sc.nextInt();

                sc.nextLine();

                System.out.print("Enter Name: ");
                String name = sc.nextLine();

                System.out.print("Enter Age: ");
                int age = sc.nextInt();

                list.add(new StudentAns(id, name, age));
                System.out.println("Student Added");
                break;

            case 3:
                System.out.print("Enter ID to update: ");
                int uid = sc.nextInt();

                for(StudentAns s : list) {
                    if(s.ID == uid) {

                        sc.nextLine();

                        System.out.print("Enter new name: ");
                        s.name = sc.nextLine();

                        System.out.print("Enter new age: ");
                        s.age = sc.nextInt();

                        System.out.println("Student Updated");
                    }
                }
                break;

            case 4:
                System.out.print("Enter ID to delete: ");
                int did = sc.nextInt();

                StudentAns removeStudent = null;

                for(StudentAns s : list) {
                    if(s.ID == did) {
                        removeStudent = s;
                    }
                }

                if(removeStudent != null) {
                    list.remove(removeStudent);
                    System.out.println("Student Deleted");
                }
                else {
                    System.out.println("Student not found");
                }

                break;

            case 5:
                System.out.println("Program Ended");
                break;

            default:
                System.out.println("Invalid choice");

        }

    } while(choice != 5);

    sc.close();
}



	}


