package ms.executor.mutithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SimpleExecutorMultithreading {

	public static void main(String[] args) {

		System.out.println("Main program starts...");

		FirstSimpleExecutorMultithreading firstSimpleExecutorMultithreading = new FirstSimpleExecutorMultithreading(
				100);
		SecondSimpleExecutorMultithreading secondSimpleExecutorMultithreading = new SecondSimpleExecutorMultithreading(
				100);

		Executors.newFixedThreadPool(1);
		Executors.newScheduledThreadPool(1);
		Executors.newSingleThreadExecutor();

		ExecutorService firstExecutor = Executors.newCachedThreadPool();
		firstExecutor.execute(firstSimpleExecutorMultithreading);
		firstExecutor.shutdown();

		ExecutorService secondExecutor = Executors.newCachedThreadPool();
		secondExecutor.execute(secondSimpleExecutorMultithreading);
		secondExecutor.shutdown();

		System.out.println("Main program exits...");

	}
}

class FirstSimpleExecutorMultithreading implements Runnable {

	private int number;

	public FirstSimpleExecutorMultithreading(int number) {
		this.number = number;
	}

	public void run() {
		for (int i = 0; i < number; i++) {
			if (i % 2 == 0)
				System.out.println("Even number -- " + i);
		}
	}
}

class SecondSimpleExecutorMultithreading implements Runnable {

	private int number;

	public SecondSimpleExecutorMultithreading(int number) {
		this.number = number;
	}

	public void run() {
		for (int i = 0; i < number; i++) {
			if (i % 2 == 1)
				System.out.println("Odd number -- " + i);
		}
	}
}
