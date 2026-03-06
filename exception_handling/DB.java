package exception_handling;

public class DB {
	public static void verifier(Student student) throws StudentNotFoungException {
		if(student != null) {
			System.out.println(student);
		}
		else {
			throw new StudentNotFoungException();
		}
	}

}
