package Test14;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStream;
import java.io.StringReader;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		final String filename = "Test15.txt";
		File f = new File(filename);
		
		String name;
		String sex;
		int age;
		String className;
		Scanner in = new Scanner(System.in);
		System.out.print("输入名字：");
		name = in.next();
		System.out.print("输入性别：");
		sex = in.next();
		System.out.print("输入年龄：");
		age = in.nextInt();
		System.out.print("输入班级：");
		className = in.next();
		try {
			FileOutputStream fos = new FileOutputStream(f);
			String data = "姓名:" + name + " 性别:" + sex + " 年龄:" + age + " 班级:" + className;
			fos.write(data.getBytes());
			

			FileReader fileReader = new FileReader(f); 
			BufferedReader bReader = new BufferedReader(fileReader);
			String str = bReader.readLine();
			System.out.println(str);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
