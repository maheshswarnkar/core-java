package ms.lambda.ex;

@FunctionalInterface
interface MathOperation {
	int operation(int a, int b);
}

public class LambdaEx {

	private int operate(int a, int b, MathOperation mathOperation) {
		return mathOperation.operation(a, b);
	}

	public static int add(int a, int b) {
		return (a + b);
	}

	public static void main(String[] args) {

		LambdaEx lambdaEx = new LambdaEx();

		System.out.println("Addition of two numbers (1 and 4) " + add(1, 4));
		MathOperation subtract = (a, b) -> (a - b);
		MathOperation add = (a, b) -> (a + b);

		System.out.println("10 - 5 = " + lambdaEx.operate(10, 5, subtract));
		System.out.println("10 + 5 = " + lambdaEx.operate(10, 5, add));
		System.out.println("10 * 5 = " + lambdaEx.operate(10, 5, ((a, b) -> (a * b))));
		
	}
}
