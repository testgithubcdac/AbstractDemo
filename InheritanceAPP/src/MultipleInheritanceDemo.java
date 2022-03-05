class Test{
	void display() {
		System.out.println("I am Test method.");
	}
}
class MidTest{
	void display() {
		System.out.println("I am MidTest method.");
	}
}
class Result extends MidTest{
	void myTest() {
		System.out.println("My test");
	}
}
public class MultipleInheritanceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Result rs=new Result();
rs.display();
rs.myTest();
	}

}
