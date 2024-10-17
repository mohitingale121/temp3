package bufferWriter;

import java.io.*;

public class filereader {
public static void main(String[] args) {
	File file =new File("C:\\Users\\mohit\\Desktop");
	int aa=0;

		String[]list=file.list();
		for(String a:list) {
			System.out.println(a);
			aa++;
		}
	System.out.println("total no of files :"+aa);	
	
}
}
