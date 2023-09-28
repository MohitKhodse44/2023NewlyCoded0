package com.jspiders.filehanding.operation;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamWrite {

	public static void main(String[] args) throws IOException {
		
		File file = new File("Demo3.txt");
		
		if(file.exists())
		{
			FileOutputStream fileoutputstream= new FileOutputStream(file);
			fileoutputstream.write(100);
			System.out.println("data written to the file");
			fileoutputstream.close();
		}
		else
		{
			file.createNewFile();
			System.out.println("file is created");
			
			FileOutputStream fileoutputstream = new FileOutputStream(file);
			fileoutputstream.write(101);
			System.out.println("data written to the file as ");
			fileoutputstream.close();
		}
		

	}

}
