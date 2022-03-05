class Single{
	public void display() throws InterruptedException {
		for(int i=0;i<5;i++) {
			System.out.println(i+"Thread is Executing");
				Thread.sleep(500);
			
				// TODO Auto-generated catch block
			
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
