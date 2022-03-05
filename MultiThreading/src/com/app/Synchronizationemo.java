package com.app;
class Table{
	public  synchronized void print(int num) {
		for(int i=1;i<=10;i++) {
			System.out.println(i*num);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
class MyThread1 extends Thread{
Table table;
public MyThread1(Table table) {
	// TODO Auto-generated constructor stub
	this.table=table;
}
public void run() {
	table.print(5);
}
}
class MyThread2 extends Thread{
Table table;
public MyThread2(Table table) {
	// TODO Auto-generated constructor stub
	this.table=table;
}
public void run() {
	table.print(20);
}
}
public class Synchronizationemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Table t=new Table();
MyThread1 t1=new MyThread1(t);
MyThread2 t2=new MyThread2(t);
t1.start();
t2.start();
	}

}
