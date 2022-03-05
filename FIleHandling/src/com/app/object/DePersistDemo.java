package com.app.object;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DePersistDemo {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub

	ObjectInputStream ois=
	new ObjectInputStream(new FileInputStream("D:\\CDAC_OCT2021_Core_Java\\Student.txt"));
	Student st=(Student)ois.readObject();
	System.out.println("Name:"+st.getName());
	System.out.println("Address:"+st.getAddress());
	System.out.println("DOB:"+st.getDob());
	System.out.println("Roll No:"+st.getRollNo());
	ois.close();
	
	}

}
