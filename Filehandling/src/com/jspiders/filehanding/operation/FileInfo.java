package com.jspiders.filehanding.operation;

import java.io.File;

public class FileInfo {

	public static void main(String[] args) {
	
		File file= new File("Demo1.txt");
		System.out.println(file.getName());
		System.out.println(file.getAbsolutePath());
		System.out.println(file.length());
		if(file.canRead()) {
			System.out.println("file is readable.");
			
		}
		else {
			System.out.println("file is not readable");
		}
		if(file.canWrite())
		{
			System.out.println("file is writable.");
		}
		else {
			System.out.println("file is not writable");
		}
			if(file.canExecute())
			{
				System.out.println("file is executable.");
			}
			else {
				System.out.println("file is not executable");
			}
		}
		
				

	}


