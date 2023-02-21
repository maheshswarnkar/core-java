package ms.oops.nice;

public class Demo5 {
	public static void main(String[] args) {
		int x = 5, y = 10;
		try {
			y /= x;
		} catch (Exception e) {
			System.out.println("Error");
		} finally {
			System.out.println("finally");
		}
	}

}
