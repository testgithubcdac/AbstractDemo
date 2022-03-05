abstract class  A{
	abstract void  m1();
	abstract void m2();
	void show() {
		System.out.println("hiiii");
	}
	
}
class B extends A {

	@Override
	void m2() {
		// TODO Auto-generated method stub
		System.out.println("I am m2");
	}

	@Override
	void m1() {
		// TODO Auto-generated method stub
		System.out.println("I am m1");	
	}
	
}
public class AbstractDemoApp {
	public static void main(String[] args) {
		A oa=new B();
		oa.m1();
		oa.m2();
	}

}
