class Single{
	public void display() throws InterruptedException {
		for(int i=0;i<100;i++) {
			System.out.println(i+"Thread is Executing");
			Thread.sleep(2000);
		}
	}
}
public class SingleThreadDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
Single s=new Single();
s.display();
	}

}
