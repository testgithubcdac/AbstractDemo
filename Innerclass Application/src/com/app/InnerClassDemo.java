package com.app;

class Outer{
	class Inner{//member inner class
		public void display() {
			System.out.println("In a nested class method...!");
		}
		
	}
	class Inner1{
		public void display() {
			System.out.println("In a nested class Inner1 method...!");
		}
		
	}
}
public class InnerClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Outer out=new Outer();
Outer.Inner1 in=out.new Inner1();
Outer.Inner oin=new Outer().new Inner();
in.display();
oin.display();

	}

}
