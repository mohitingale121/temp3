package bufferWriter;

import java.io.*;

public class filemerge {

	public static void main(String[] args) {
		
		String path = "C:\\Users\\mohit\\Desktop\\projects3";

		File file = new File(path);
		File file1 = new File(path + "\\abc.txt");
		File file2 = new File(path + "\\xyz.txt");
		boolean a = false;
		boolean b = false;
		if (file.mkdir()) {

			try {
				a = file1.createNewFile();
				FileWriter f1 = new FileWriter(file1);

				try (BufferedWriter b1 = new BufferedWriter(f1)) {
					b1.write("AAAAA" + '\n');
					b1.write("BBBBB" + '\n');
					b1.write("CCCCC" + '\n');
					b1.write("DDDDD" + '\n');
					System.out.println("abc sucessfully created");
				}

			} catch (IOException e) {
				System.out.println("Exception occured");
				e.getStackTrace();
			}

			try {
				b = file2.createNewFile();
				FileWriter f2 = new FileWriter(file2);
				System.out.println("xyz sucessfully created");
				try (BufferedWriter b2 = new BufferedWriter(f2)) {
					b2.write("XXXXX" + '\n');
					b2.write("YYYYY" + '\n');
					b2.write("ZZZZZ" + '\n');
					b2.write("IIIII" + '\n');
				}

			} catch (IOException e) {
				System.out.println("Exception occured");
				e.getStackTrace();
			}
		} else {
			System.out.println("File already exists");
		}

		File file3 = new File(path + "\\merge.txt");

		String line1;

		try (
				BufferedWriter x4 = new BufferedWriter(new FileWriter(file3));
				BufferedReader x1 = new BufferedReader(new FileReader(file1));
				BufferedReader x2 = new BufferedReader(new FileReader(file2));) {

			while ((line1 = x1.readLine()) != null) {
				x4.write(line1);
				x4.newLine();

				

			}
			while ((line1 = x2.readLine()) != null) {
				x4.write(line1);
				x4.newLine();
				

			}

		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
