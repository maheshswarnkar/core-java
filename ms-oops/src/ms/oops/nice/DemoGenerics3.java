package ms.oops.nice;


class Demo<T>{
	T obj;
	
	public Demo(T obj) {
		this.obj = obj;
	}
	public T returnObject() {
		return this.obj;
	}
}

public class DemoGenerics3 {

	public static void main(String[] args) {
		Demo<Integer> demoInteger = new Demo<Integer>(15);
		System.out.println(demoInteger.returnObject());
		Demo<String> demoString = new Demo<String>("HelloWorld");
		System.out.println(demoString.returnObject());
	}

}
