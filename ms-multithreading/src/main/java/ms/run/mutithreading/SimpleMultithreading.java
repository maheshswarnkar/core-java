package ms.run.mutithreading;

public class SimpleMultithreading {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("Main Program");
		FirstSimpleMultithreading evenNumberThread = new FirstSimpleMultithreading(100);
		SecondSimpleMultithreading oddNumberThread = new SecondSimpleMultithreading(100);

		Thread evenThread = new Thread(evenNumberThread);
		evenThread.start();
		Thread oddThread = new Thread(oddNumberThread);
		oddThread.start();
		
		evenThread.join();
		oddThread.join();
		
		System.out.println("Main Program -- end..");
	}
}

class FirstSimpleMultithreading implements Runnable {

	private int number;

	public FirstSimpleMultithreading(int num) {
		this.number = num;
	}

	public void run() {
		for (int i = 0; i <= number; i++) {
			if (i % 2 == 0) {
				System.out.println("Even number -------------" + i);
			}
		}
	}
}

class SecondSimpleMultithreading implements Runnable {

	private int number;

	public SecondSimpleMultithreading(int num) {
		this.number = num;
	}

	public void run() {
		for (int i = 0; i <= number; i++) {
			if (i % 2 == 1) {
				System.out.println("Odd number " + i);
			}
		}
	}
}
