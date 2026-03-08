package ClassAndObjects;

public class finalKeyword {
	public static void fk() {
		final int a = 10;
		a = 20;   //error because final variable's (a) value cannot be changed.
		System.out.println(a);
	}

}
