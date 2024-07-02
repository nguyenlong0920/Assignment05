package exercise01;

public class ExceptionDemo {
	public static void main(String[] args) {
		try {
			throw new Exception("This is an exception!");
		} catch (Exception e) {
			System.out.println("Exception caught: " + e.getMessage());
		} finally {
			System.out.println("Finally!");
		}
	}
}
