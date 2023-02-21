package ms.oops.nice;

public class Test2 {

	public static void main(String[] args) {
		try {

			Test2 test = new Test2();
			test.isNegative(-1);
			System.out.println("try");

		} catch (Exception e) {
			System.out.println("catch");
		} finally {
			System.out.println("finally");
		}

	}

	private void isNegative(int num) {
		if (num >= 0)
			throw new RuntimeException();

	}

}
