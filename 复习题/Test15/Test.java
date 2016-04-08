package Test15;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Test {

	public static void copyFile(String srcFile, String tagFile) {
		File sf = new File(srcFile);
		File tf = new File(tagFile);
		FileOutputStream fos = null;
		FileInputStream fis = null;
		byte[] buf = new byte[1024];
		int count = 0;
		try {
			fis = new FileInputStream(sf);
			fos = new FileOutputStream(tf);
			
			while ((count = fis.read(buf)) != -1) {
				fos.write(buf, 0, count);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (fis != null)
					fis.close();
				if (fos != null)
					fos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("输入源文件名:");
		String srcFile = in.next();
		System.out.println("输入目标文件名:");
		String tagFile = in.next();
		copyFile(srcFile, tagFile);
	}

}
