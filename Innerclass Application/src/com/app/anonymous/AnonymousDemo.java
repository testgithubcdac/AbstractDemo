package com.app.anonymous;

class Demo {
	void show() {
		System.out.println(" I am in show method of super class...!");
	}
}

public class AnonymousDemo {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo d = new Demo() {
			void show() {
				super.show();
				System.out.println(" I am in AnonymousDemo class");
			}
		};
d.show();
	}

}
