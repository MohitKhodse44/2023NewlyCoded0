package com.jspiders.filehanding.operation;

import java.io.File;

public class DeleteFile {
public static void main(String [] args)
{
	File file= new File("Demo3.txt");
	if(file.exists())
	{
		file.delete();
		System.out.println("file deleted successfully");
	}
	else {
		System.out.println("file does not exists");
	}
}
}
