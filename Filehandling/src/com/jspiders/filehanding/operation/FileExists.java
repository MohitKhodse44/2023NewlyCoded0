package com.jspiders.filehanding.operation;

import java.io.File;
import java.io.IOException;

public class FileExists {

	public static void main(String[] args) {
		File file = new File("Demo.txt");
		if(file.exists())
		{
			System.out.println("file already exists");
		}
		else {
			try {
				file.createNewFile();
				System.out.println("file is created");
			} catch (IOException e) {
				
				e.printStackTrace();
				System.out.println("file not created");
			}
		}
	}

}
