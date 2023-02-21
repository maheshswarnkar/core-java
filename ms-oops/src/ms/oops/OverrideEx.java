package ms.oops;


class OverrideExTestA{
	
	public Object test() {
		System.out.println("OverrideExTestA.test()");
		return 2;
	}
}

class OverrideExTestB extends OverrideExTestA{
	
	public Integer test() {
		System.out.println("OverrideExTestB.test()");
		return 2;
	}
}

public class OverrideEx {

	public static void main(String[] args) {
		OverrideExTestA exTestA = new OverrideExTestA();
		exTestA.test();
		
		OverrideExTestB exTestB = new OverrideExTestB();
		exTestB.test();
		
		OverrideExTestA exTestC = new OverrideExTestB();
		exTestC.test();
		
		

	}

}
