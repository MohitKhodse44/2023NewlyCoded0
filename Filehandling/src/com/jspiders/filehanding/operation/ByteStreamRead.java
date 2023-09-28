package com.jspiders.filehanding.operation;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ByteStreamRead {

	public static void main(String[] args) throws IOException {
		File file = new File("Demo3.txt");
		
		if(file.exists())
		{
			FileInputStream fileinputstream = new FileInputStream(file);
			System.out.println(fileinputstream.read());
			System.out.println("Data is fetched from the file.");
			fileinputstream.close();
			
		}
		else {
			System.out.println("File does not exists");		}
		

	}

}
