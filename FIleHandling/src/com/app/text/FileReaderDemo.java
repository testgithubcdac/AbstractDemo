package com.app.text;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileReader fr = new FileReader("D:\\\\CDAC_OCT2021_Core_Java\\\\sample.txt");
		int ch = 0;
		System.out.println("------------------------------------");
		while ((ch = fr.read()) != -1) {

			System.out.print((char) ch);//Hello
		}
		fr.close();
	}

}
