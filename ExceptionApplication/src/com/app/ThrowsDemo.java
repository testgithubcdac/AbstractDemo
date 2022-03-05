package com.app;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ThrowsDemo {

	public static void findFile() throws FileNotFoundException {
		File f=new File("test.text");
		FileInputStream stream=new FileInputStream(f);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sn=new Scanner(System.in);
		try {
			System.out.println("enter first number:");
		
			int a=sn.nextInt();
			System.out.println("enter second number:");
			int b=sn.nextInt();
			int c=a/b;
			System.out.println("Answer:"+c);
			String str="";
			System.out.println(str.charAt(9));
			
		} catch (ArithmeticException |InputMismatchException |NullPointerException |StringIndexOutOfBoundsException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		/*catch (InputMismatchException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}*/
		finally {
			sn.close();
		}
	}

}
