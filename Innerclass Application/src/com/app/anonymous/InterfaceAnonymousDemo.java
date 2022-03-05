package com.app.anonymous;
interface Hello{
	void show();
}
public class InterfaceAnonymousDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Hello hello=new Hello() {
	public void show() {
		System.out.println("I am Anonymous class ");
	}
};
hello.show();
	}

}
