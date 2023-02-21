package ms.run.mutithreading;

public class WaitAndSleep {
	private int k;
	private Integer i;

	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((i == null) ? 0 : i.hashCode());
		result = prime * result + k;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		WaitAndSleep other = (WaitAndSleep) obj;
		if (i == null) {
			if (other.i != null)
				return false;
		} else if (!i.equals(other.i))
			return false;
		if (k != other.k)
			return false;
		return true;
	}

	public static void main(String[] args) {
		System.out.println("Main Program");
		FirstWaitAndSleep FirstWaitAndSleep = new FirstWaitAndSleep(100);
		Thread firstThread = new Thread(FirstWaitAndSleep);
		firstThread.start();

		System.out.println("Main Program -- end..");
	}
}

class FirstWaitAndSleep implements Runnable {

	private int number;

	public FirstWaitAndSleep(int num) {
		this.number = num;
	}

	public void run() {
//		for (int i = 0; i <= number; i++) {
//			if (i % 2 == 0) {
//				System.out.println("Even number -------------" + i);
//			}
//		}
		
		message();
		
	}
	
	public void message() {
		try {
			wait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

