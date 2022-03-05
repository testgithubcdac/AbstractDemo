interface MyInterface {
	public static final int age = 20;

	public abstract void display();

	int myNo = 202;// public static final int myNo;

	void show();// public abstract void show();
}

class Myimplaments implements MyInterface {

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("display" + age);
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("show");
	}

}

public class InterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyInterface myInterface = new Myimplaments();
		myInterface.display();
		myInterface.show();

	}

}
