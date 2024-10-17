package createdirectory;

import java.io.*;
import java.io.IOException;
public class a {
	public static void main(String[] args) {
		String cwd =System.getProperty("user.dir");
try{
String path="C:/Users/mohit/Desktop";
		File f0 =new File(path,"projects2");
		File f1 = new File(path,"projects2/java");
		File f2 = new File(path,"projects2/python");
		File f3 = new File(f0,"abc.txt");
		File f4 = new File(f0,"xyz.pdf");
		File f5 = new File(f0,"pqr.csr");
		
		

	
		System.out.println("current working directiory"+cwd);
		
		
		if (f0.mkdir()) {
			System.out.println("f0 is sucessfully created");
			System.out.println(f0.getAbsolutePath());
		
		} else {
			System.out.println(" f0 already exists");
		}
		if (f1.mkdir()) {
			System.out.println("f1 is sucessfully created");
			System.out.println(f1.getAbsolutePath());
		} else {
			System.out.println(" f0 already exists");
		}
		if (f2.mkdir()) {
			System.out.println("f2 is sucessfully created");
			System.out.println(f2.getAbsolutePath());
		} else {
			System.out.println(" f2 already exists");
		}
		if (f3.createNewFile()) {
			System.out.println("abc.txt sucessfully created");
			System.out.println(f3.getAbsolutePath());
		} else {
			System.out.println(" abc.txt already exists");
		}
		if (f4.createNewFile()) {
			System.out.println("xyz.pdf sucessfully created");
			System.out.println(f4.getAbsolutePath());
		} else {
			System.out.println("xyz.pdf already exists");
		
		}
		if (f5.createNewFile()) {
			System.out.println("pqr.scr sucessfully created");
			System.out.println(f5.getAbsolutePath());
		} else {
			System.out.println("pqr.scr already exists");
		}
}catch(IOException e) {
	System.out.println("Error while cerating files");
	e.printStackTrace();
}

	}
}
