package com.app.staic;

class Outer {
	private static void outerMethod() {
		System.out.println("Inside outer method");
	}

	static class Inner {
		public static void display() {
			System.out.println("In a nested class method...!");
			outerMethod();
		}
public void m1() {
	System.out.println("i am m1 non-static");
}
	}
	void outerM2() {
	Outer.Inner in=new Outer.Inner();
	System.out.println("m2 of outer class");
	in.m1();
	}
}

public class StaticInnerClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Outer.Inner.display();
new Outer().outerM2();// X

	}

}
