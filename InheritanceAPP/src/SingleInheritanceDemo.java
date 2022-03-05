class A{
	void m1() {
		System.out.println("Hi I am m1 of class A last5 ");
	}
}
class B extends A{

	
	void m2() {
		System.out.println("Hi I am m2 of B laST 10");
		
	}
	void m3() {
		System.out.println("Hi I am m3 of B");
	}
}
public class SingleInheritanceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
B ob=new B();

ob.m1();
ob.m2();
ob.m3();
System.out.println(ob.toString());
	}

}
