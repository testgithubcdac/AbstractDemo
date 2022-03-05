package com.app;

public class TheDeadLockDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
final String resource1="Raj Kolhe";
final String sesource2="Priya Kolhe";
Thread t1=new Thread() {
	public void run() {
		synchronized (resource1) {
			System.out.println("Thread 1: locked resource1");
			try {Thread.sleep(1000);}catch(Exception e) {e.printStackTrace();}
		}
		synchronized (sesource2) {
System.out.println("Thread 1:locked resource2");	
try {Thread.sleep(1000);}catch(Exception e) {e.printStackTrace();}
		}
	}
};
Thread t2=new Thread() {
	public void run() {
		synchronized (resource1) {
			System.out.println("Thread 2: locked resource1");
			try {Thread.sleep(1000);}catch(Exception e) {e.printStackTrace();}
		}
		synchronized (sesource2) {
System.out.println("Thread 2:locked resource2");	
try {Thread.sleep(1000);}catch(Exception e) {e.printStackTrace();}
		}
	}
};
Thread t3=new Thread() {
	public void run() {
		synchronized (resource1) {
			System.out.println("Thread 3: locked resource1");
			try {Thread.sleep(1000);}catch(Exception e) {e.printStackTrace();}
		}
		synchronized (sesource2) {
System.out.println("Thread 3:locked resource2");	
try {Thread.sleep(1000);}catch(Exception e) {e.printStackTrace();}
		}
	}
};
Thread t4=new Thread() {
	public void run() {
		synchronized (resource1) {
			System.out.println("Thread 4: locked resource1");
			try {Thread.sleep(1000);}catch(Exception e) {e.printStackTrace();}
		}
		synchronized (sesource2) {
System.out.println("Thread 4:locked resource2");	
try {Thread.sleep(1000);}catch(Exception e) {e.printStackTrace();}
		}
	}
};
t1.start();
t2.start();
t3.start();
t4.start();
	}

}
