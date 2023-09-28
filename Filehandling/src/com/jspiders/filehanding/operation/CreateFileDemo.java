package com.jspiders.filehanding.operation;

import java.io.File;
import java.io.IOException;

public class CreateFileDemo {

	public static void main(String[] args) {
		File file = new File("Demo1.txt");
		try {
			file.createNewFile();
			System.out.println("file is created");
		} catch (IOException e) {
			
			e.printStackTrace();
			System.out.println("file is not created");
		}
	
		

	}

}
