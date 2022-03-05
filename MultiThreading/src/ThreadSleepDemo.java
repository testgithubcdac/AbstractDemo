
public class ThreadSleepDemo extends Thread {

	public void run() {
		for (int i = 0; i < 5; i++) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ThreadSleepDemo tDemo = new ThreadSleepDemo();
		ThreadSleepDemo tDemo2 = new ThreadSleepDemo();
		ThreadSleepDemo tDemo3 = new ThreadSleepDemo();

tDemo.start();
try {
	tDemo.join(500);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
tDemo2.start();
tDemo3.start();
		/*
		 * for (int i = 1; i <= 5; i++) { try { Thread.sleep(1000); } catch
		 * (InterruptedException e) { // TODO Auto-generated catch block
		 * e.printStackTrace(); } System.out.println(i); }
		 */
	}

}
