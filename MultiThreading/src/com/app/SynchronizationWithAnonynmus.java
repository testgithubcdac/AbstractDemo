package com.app;

class TablePrint {
	public void print(int n) {
		synchronized (this) {
			for (int i = 1; i <= 10; i++) {
				System.out.println(i * n);
			}
			try {
				Thread.sleep(400);
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
		System.out.println("Hi");
	}
}

public class SynchronizationWithAnonynmus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final Table table = new Table();// only one object
		Thread t1 = new Thread() {
			public void run() {
				table.print(5);
			}
		};
		Thread t2 = new Thread() {
			public void run() {
				table.print(25);
			}
		};
		t1.start();
		t2.start();
	}

}
