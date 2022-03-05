class SetName implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		Thread t=Thread.currentThread();
		System.out.println("Thread Name:"+t.getName()+"and Priority:"+t.getPriority());
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
public class SetNameAndPriorityDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
SetName s=new SetName();
Thread t=new Thread(s);
t.setName("Raj");
t.setPriority(Thread.MAX_PRIORITY);
t.start();
Thread t1=new Thread(s);
t1.setName("Pooja");
t1.start();
Thread t2=new Thread(s);
t2.setName("Priya");
t2.setPriority(Thread.MIN_PRIORITY);
t2.start();
	}

}
