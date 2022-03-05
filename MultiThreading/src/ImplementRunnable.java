class MyThread implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Now thread is running");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
public class ImplementRunnable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
MyThread myThread=new MyThread();
//Thread t1=new Thread(myThread);
for(int i=0;i<100;i++) {
	Thread t1=new Thread(myThread);
t1.start();
	}
	}
}
