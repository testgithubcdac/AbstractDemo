package com.app;
class Customer{
	int amount=10000;
	synchronized void  withdraw(int amount) {
		System.out.println("going to withdraw ...!");
		if(this.amount<amount) {
			System.out.println("Account balance is:"+this.amount);
			System.out.println("Less balance ;waiting for deposit balance:"+amount);
			try {	wait();	} catch (InterruptedException e) {	e.printStackTrace();}
		}
			this.amount-=amount;
			System.out.println("withdraw complated...!balance:"+amount);
			System.out.println("Account balance is:"+this.amount);
		
		
	}
	synchronized void  deposit(int amount) {
		System.out.println("going to deposit ...!");
		this.amount+=amount;
		System.out.println("deposit complated....!balance:"+amount);
		System.out.println("Account balance is:"+this.amount);
		notify();
			
		
		
	}
}
public class InnerThreadCommuDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Customer customer=new Customer();
new Thread() {
	public void run() {
		customer.withdraw(15000);
	}
}.start();
	
	new Thread() {
		public void run() {
			customer.deposit(10000);
		}
	}.start();
		}

}
