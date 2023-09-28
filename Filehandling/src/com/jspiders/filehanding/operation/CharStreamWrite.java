package com.jspiders.filehanding.operation;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CharStreamWrite {

	public static void main(String[] args) throws IOException {
		File file = new File("Demo1.txt");
		if(file.exists())
		{
			FileWriter filewriter = new FileWriter(file);
					filewriter.write("data from java program");
			System.out.println("data written to the file");
			filewriter.close();
			
		}
		else {
			file.createNewFile();
			System.out.println("file is created");
			FileWriter fileWriter = new FileWriter(file);
					fileWriter.write("data from java program");
			System.out.println("data written from the file");
			fileWriter.close();
		}

	}

}
