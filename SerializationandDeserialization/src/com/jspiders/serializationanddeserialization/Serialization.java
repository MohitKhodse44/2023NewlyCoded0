package com.jspiders.serializationanddeserialization;

import java.io.File;
//import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
//import com.jspiders.serializationanddeserialization.Student;

public class Serialization {

	public static void main(String[] args) throws IOException {
		
		File file = new File("student.txt");

		if(file.exists())
		{
			System.out.println("File exists");
			FileOutputStream fileoutputstream = new FileOutputStream(file);
			
			ObjectOutputStream objectoutputstream = new ObjectOutputStream(fileoutputstream);
			
			objectoutputstream.writeObject(new Student(1,"ram","ram@gmail.com",25));
			
			System.out.println("object is written to the file");
			objectoutputstream.close();
			fileoutputstream.close();
		}
		
		else {
			file.createNewFile();
			FileOutputStream fileoutputstream = new FileOutputStream(file);
			ObjectOutputStream objectoutputstream = new ObjectOutputStream(fileoutputstream);
			
             objectoutputstream.writeObject(new Student(1,"ram","ram@gmail.com",25));
			
			System.out.println("object is written to the file");
			objectoutputstream.close();
			fileoutputstream.close();
			
			
		}

	}

}
