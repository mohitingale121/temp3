package test;

import java.io.*;
import java.util.*;

public class demo1 {
	public static void main(String[] args) throws IOException {
		File file = new File("C:\\Users\\mohit\\Desktop\\projects2/Text.txt");
		BufferedWriter bw = new BufferedWriter(new FileWriter(file));
		bw.write("this is line 1 \n");
		bw.write("this is line 2 \n");
		bw.write("this is line 3 \n");
		bw.write("this is line 4 \n");
		bw.write("this is line 5 \n");
		bw.close();

		Scanner sc = new Scanner(file);
		String data = "";
		while (sc.hasNext()) {

			String a = sc.nextLine();
			data = data + a + '\n';

		}
		System.out.println(data);
		System.out.println("");

		BufferedReader br = new BufferedReader(new FileReader(file));
		int count = 1;
		while (count <= 3) {
			System.out.println(br.readLine());
			count++;
		}
		br.close();
	}

}