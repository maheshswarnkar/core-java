package ms.oops;

class TestA {

	public static void test() {

	}

}

class TestB extends TestA {
	public static void test() {

	}
}

public class StaticMethodTest {

	public String toString() {
		System.out.println("Test toString called");
		return "";
	}

	public static void main(String args[]) {
//		System.out.println(toString());
	}

}
