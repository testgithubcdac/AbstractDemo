package com.app.object;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.time.LocalDate;

public class PersistDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student st=new Student();
		st.setAddress("Pune,Maharashtra");
		st.setName("Raj Kolhe");
		st.setRollNo(101);
		st.setDob(LocalDate.of(1992, 01, 01));
		try {
			FileOutputStream fos=new FileOutputStream("D:\\CDAC_OCT2021_Core_Java\\Student.txt");
			ObjectOutputStream oos=new ObjectOutputStream(fos);
			oos.writeObject(st);
			oos.flush();
			oos.close();
			System.out.println("Data Write successFully.....");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
