package com.app.text;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			FileWriter fw=new FileWriter("D:\\CDAC_OCT2021_Core_Java\\Sample1.txt");
			fw.write("Hello Friends How are you...!");
			fw.write("good eveninng");
			fw.append("\r\n Good bye...!");
			
			System.out.println("file created successfully...!");
			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
