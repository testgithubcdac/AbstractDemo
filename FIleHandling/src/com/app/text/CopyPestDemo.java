package com.app.text;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.tools.FileObject;

public class CopyPestDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileInputStream fis = new FileInputStream("C:\\Users\\Public\\Videos\\Sample Videos\\Wildlife.wmv");
			FileOutputStream fos = new FileOutputStream("D:\\CDAC_OCT2021_Core_Java\\sample.wmv");
			int ch = 0;
			int count = 0;
			while ((ch = fis.read()) != -1) {
				fos.write((byte) ch);

			}
			System.out.println("file transfer successfully...!");
			fis.close();
			fos.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
