class Multi implements Runnable{
	public void run()  {
		for(int i=0;i<100;i++) {
			System.out.println(i+"Thread is Executing");
			/*
			 * try { // Thread.sleep(2000); } catch (InterruptedException e) { // TODO
			 * Auto-generated catch block e.printStackTrace(); } }
			 */
	}
}
}
public class MultiThreadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Multi multi=new Multi();
Thread t=new Thread(multi);
t.start();
	}

}
