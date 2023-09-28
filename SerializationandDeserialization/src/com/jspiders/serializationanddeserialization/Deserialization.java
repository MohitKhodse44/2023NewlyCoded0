package com.jspiders.serializationanddeserialization;

import java.io.File;
import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserialization {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		File file = new File("Student.txt");
		
		if(file.exists())
		{
			FileInputStream fileinputstream = new FileInputStream(file);
			ObjectInputStream objectinputstream = new ObjectInputStream( fileinputstream);
			Student student = (Student) objectinputstream.readObject();
			System.out.println(student);
			System.out.println("Object is fetched from the file");
			objectinputstream.close();
			fileinputstream.close();
		}
		else {
			System.out.println("file does not exists");
			
		}
		
	}

}
