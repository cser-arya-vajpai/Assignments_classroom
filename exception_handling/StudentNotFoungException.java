package exception_handling;

public class StudentNotFoungException extends RuntimeException {
	
	@Override 
	public String getMessage() {
		return "Student Object Doesnt exist";
	}

}
