package org.ms.constructor;

class ConstructorA {
	public ConstructorA() {
		System.out.println("Call class A contructor");
	}
}

class ConstructorB extends ConstructorA {
	public ConstructorB() {
		System.out.println("Call class B contructor");
	}
}

class ConstructorC extends ConstructorB {
	public ConstructorC() {
		System.out.println("Call class C contructor");
	}
}

public class ConstructorExample {

	public ConstructorExample() {
		ConstructorC constructorCObj = new ConstructorC();
		System.out.println("Call class ConstructorExample contructor");
	}

	public static void main(String[] args) {
		ConstructorExample constructorExample = new ConstructorExample();
	}

}
