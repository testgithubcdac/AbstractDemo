package com.app;
class TablePrintn{
	public  synchronized  static void print(int num) {
		for(int i=1;i<=10;i++) {
			System.out.println(i*num);
			try {
				Thread.sleep(500);]]
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
class MyThread11 extends Thread{
	public void run() {
		TablePrintn.print(10);
	}
}
class MyThread12 extends Thread{
	public void run() {
		TablePrintn.print(12);
	}
}
class MyThread13 extends Thread{
	public void run() {
		TablePrintn.print(13);
	}
}
class MyThread14 extends Thread{
	public void run() {
		TablePrintn.print(14);
	}
}
public class StaticSynchronizationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
MyThread11 t11=new MyThread11();
MyThread12 t12=new MyThread12();
MyThread13 t13=new MyThread13();
MyThread14 t14=new MyThread14();
t11.start();
t12.start();
t13.start();
t14.start();
	}

}
