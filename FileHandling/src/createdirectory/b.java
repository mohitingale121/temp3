package createdirectory;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

import java.io.IOException;

public class b {
	public static void main(String[] args) {
		String s = System.getProperty("user.dir");
		File f2 = new File(s + "\\text");
		try {
			f2.mkdir();
			File f0 = new File(f2 + "\\text.txt");
			// FileWriter f1 = new FileWriter(f0);
			System.out.println(s);
			if (f0.createNewFile()) {
				System.out.println("file is created sucssfully");

			} else {
				System.out.println("File already exists");
			}

			try (FileWriter b1 = new FileWriter(f0)) {
				b1.write("hello my friend");
				System.out.println(f0.getAbsolutePath());

				FileReader b2 = new FileReader(f0);
				try (BufferedReader b3 = new BufferedReader(b2)) {

				
					

						System.out.println(b3.readLine());
					}
				}

			
		} catch (IOException e) {
			System.out.println("Exception occured");
			e.printStackTrace();

		}

	}//write a program to find total no of files and folders are persent in given directory
	//
}
