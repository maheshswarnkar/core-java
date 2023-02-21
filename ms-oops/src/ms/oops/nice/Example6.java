package ms.oops.nice;

public class Example6<T> {

	private T ex1;
	private Example6 <T> ex2;
	public Example6 (T ex1, Example6<T> ex2) {
		this.ex1 = ex1;
		this.ex2 = ex2;
	}
	public T getData() {
		return ex1;
	}
}
