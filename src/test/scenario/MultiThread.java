package test.scenario;

public class MultiThread extends Thread {
	public void run() {
		for (int i = 1; i < 5; i++) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				System.out.println(e);
			}
			System.out.print(i+"   ");
		}
	}

	public static void main(String args[]) {
		MultiThread t2 = new MultiThread();
		MultiThread t1 = new MultiThread();

		t2.setPriority(Thread.MAX_PRIORITY);
		t1.start();
		try {
			t1.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		t2.start();		
	}
}
