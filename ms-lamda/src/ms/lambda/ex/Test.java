package ms.lambda.ex;

import java.util.ArrayList;
import java.util.List;

public class Test implements Runnable {
	
	public static void test() {
		try {
//		badMethod();
		System.out.println("A");
		}catch (Exception e) {
			System.out.println("B");
		}finally {
			System.out.println("C");
		}
		System.out.println("D");
	}
	
	public static void badMethod() {
		throw new Error();
	}
	
	
	
	public static void main(String[] args)  {
		new Thread(new Test("Wallace")).start();
		new Thread(new Test("Gromit")).start();
		
		String sr = "";
		
		List<Integer> i = new ArrayList<>();
		i.add(1);
		System.out.println(i.get(0));
	}
	private String name;
	public Test(String name) {
		this.name = name;
	}
	public void run() {
		message(1); message(2);
	}

	private synchronized void message(int n) {
		System.out.println(name +" - "+n +"");
	}

}
