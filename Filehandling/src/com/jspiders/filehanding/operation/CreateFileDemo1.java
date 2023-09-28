package com.jspiders.filehanding.operation;

import java.io.File;
import java.io.IOException;

public class CreateFileDemo1 {

	public static void main(String[] args) {
		File file = new File("C:\\Users\\khdmo\\eclipse-workspace\\Filehandling/Demo3.TXT");
		try {
			file.createNewFile();
			System.out.println("file is created");
		} catch (IOException e) {
			
			e.printStackTrace();
			System.out.println("file is not created");
		}
	
		

	}

}

