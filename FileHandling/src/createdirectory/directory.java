package createdirectory;

import java.io.File;
import java.io.IOException;
public class directory {
	public static void main(String[] args) {
try{
String path="C:/Users/mohit/Desktop";
		File f0 =new File(path,"projects");
		File f1 = new File(path,"projects/java");
		File f2 = new File(path,"projects/python");
		File f3 = new File(f0,"abc.txt");
		File f4 = new File(f0,"xyz.pdf");
		File f5 = new File(f0,"pqr.csr");
		
		
		boolean p = f0.mkdir();
		boolean b = f1.mkdir();
		boolean c = f2.mkdir();
		boolean f = f3.createNewFile();
		boolean g = f4.createNewFile();
		boolean h = f5.createNewFile();
		
		
		
		if (p) {
			System.out.println("f0 is sucessfully created");
		} else {
			System.out.println(" f0 already exists");
		}
		if (c) {
			System.out.println("f2 is sucessfully created");
			
		} else {
			System.out.println(" f2 already exists");
		}
		if (f) {
			System.out.println("abc.txt sucessfully created");
		} else {
			System.out.println(" abc.txt already exists");
		}
		if (g) {
			System.out.println("xyz.pdf sucessfully created");
			
		} else {
			System.out.println("xyz.pdf already exists");
		}
		if (h) {
			System.out.println("pqr.scr sucessfully created");
		} else {
			System.out.println("pqr.scr already exists");
		}
}catch(IOException e) {
	System.out.println("Error while cerating files");
	e.printStackTrace();
}

	}
}
