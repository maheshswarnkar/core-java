package ms.oops;

class Animal{
	public Animal() {
		System.out.println("Print Animal class contructor");
	}
}

class Cat extends Animal{
	public Cat() {
		System.out.println("Print Cat class contructor");
	}
}

public class ObjectTest {

	public static void main(String[] args) {
		Cat c = new Cat();

	}

}
