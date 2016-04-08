package Test16;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		String phone = "";
		String name = "";
		Scanner in = new Scanner(System.in);
		System.out.println("请输入一些电话号码和姓名，用空格分隔，输入Done结束：");
		File f = new File("Test16.txt");
		FileWriter fileWriter = null;
		FileReader fileReader = null;
		try {
			fileWriter = new FileWriter(f);
			phone = in.next();
			while (!phone.equals("Done")) {
				name = in.next();
				fileWriter.append(phone + "," + name + "\n");
				phone = in.next();
			}
			fileWriter.flush();
			
			fileReader = new FileReader(f);
			BufferedReader bReader = new BufferedReader(fileReader);
			String line = null;
			while ((line = bReader.readLine()) != null) {
				System.out.println(line);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (fileWriter != null)
					fileWriter.close();
				if (fileReader != null)
					fileReader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}

}
