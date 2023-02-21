package ms.oops.nice;

class X {
	public void c1() {
		System.out.println("x1");
	}
}

class Y extends X {
	public void c1() {
		super.c1();
		System.out.println("y1"+super.c1());
	}
}

class Z extends Y {
	public void c1() {
		System.out.println("Z1"+super.c1());
	}
}

public class Example7 {
	public static void main(String[] args) {
		new Z().c1();
	}
}
