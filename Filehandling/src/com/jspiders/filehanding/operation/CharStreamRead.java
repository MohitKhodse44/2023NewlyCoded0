package com.jspiders.filehanding.operation;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class CharStreamRead {

	public static void main(String[] args) throws IOException {
		
		File file= new File("Demo1.txt");
		
		
	
		if(file.exists())
		{
			FileReader fileReader = new FileReader(file);
			System.out.println(fileReader.read()); //it is just gonna read the first letter and gets us it's ASCII value of first letter.
			System.out.println("Data fetchede from the file using filereader");
			fileReader.close();
			
			
			Scanner sc= new Scanner(file);
			while(sc.hasNextLine())
			{
				System.out.println(sc.nextLine());
				//it is going to read all the lines present in the text file
				
		}
			System.out.println("data fetched from the file using scanner");
			sc.close();
		
		}
		else {
			System.out.println("file dos not exists");
		}
		}

	}


