package com.app.method;

class Outer {
	void outerMethod() {
 int x=90;
		class Inner {
			public void display() {
				System.out.println("In a nested class method...!"+x);
			}

		}
		Inner in=new Inner();
		in.display();
	}
}
public class MethodInnerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Outer out=new Outer();
out.outerMethod();
	}

}
