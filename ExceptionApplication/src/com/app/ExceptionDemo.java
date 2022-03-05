package com.app;

public class ExceptionDemo {
public static void dividByZero() {
	throw new ArithmeticException("Trying to divid by 0");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			dividByZero();
			int divide=10/0;
			System.out.println("Rest of the code"+divide);
			
		} 
			  catch (ArithmeticException e) { // TODO: handle exception
			  System.err.println("Arithmatic Exception:"+e); }
			 
		finally {
			System.out.println("i am finally...");
		}
	}

}
