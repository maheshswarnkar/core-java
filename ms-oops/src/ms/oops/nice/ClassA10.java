package ms.oops.nice;


public class ClassA10 extends Exception {

	public static void main(String[] args) {
		int x = 5, y = 0;
		try {
			y = y/ x;
			try {
				throw new ClassA10();
			}catch (ClassA10 e) {
				System.out.println("Exception");
			}
		} catch (ArithmeticException e) {
			System.out.println("Error");
		} finally {
			System.out.println("finally");
		}

	}

}
