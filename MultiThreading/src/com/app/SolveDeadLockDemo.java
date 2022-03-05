package com.app;

public class SolveDeadLockDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SolveDeadLockDemo deadLockDemo = new SolveDeadLockDemo();
		final Resource1 resource1 = deadLockDemo.new Resource1();
		final Resource2 resource2 = deadLockDemo.new Resource2();

		Runnable runnable1 = new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				synchronized (resource2) {
					try {
						System.out.println(resource2.getI());
						Thread.sleep(500);
					} catch (Exception e) {
						// TODO: handle exception
					}
				}
				synchronized (resource1) {
					System.out.println(resource1.getI());
					System.out.println("in Block1");
				}
			}
		};
		Runnable runnable2 = new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				synchronized (resource2) {

					synchronized (resource1) {
						System.out.println("in Block2");
					}
				}
			}
		};
new Thread(runnable1).start();
new Thread(runnable2).start();
	}

	private class Resource1 {
		private int i = 10;

		public int getI() {
			return i;
		}

		public void setI(int i) {
			this.i = i;
		}
	}

	private class Resource2 {
		private int i = 20;

		public int getI() {
			return i;
		}

		public void setI(int i) {
			this.i = i;
		}
	}
}
