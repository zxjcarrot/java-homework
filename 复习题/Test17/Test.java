package Test17;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Test {

	public static void main(String[] args) {
		File f = new File("read.txt");
		File tf = new File("edited.txt");
		FileWriter fileWriter = null;
		FileReader fileReader = null;
		try {
            InputStreamReader isr = new InputStreamReader(new FileInputStream(f), "gb2312");  
			BufferedReader bReader = new BufferedReader(isr);
			OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream(tf), "gb2312");
			BufferedWriter bWriter = new BufferedWriter(osw);
			String line = null;
			while ((line = bReader.readLine()) != null) {
				String parts[] = line.split(",");
				double s1 = Double.parseDouble(parts[1]);
				double s2 = Double.parseDouble(parts[2]);
				double s3 = Double.parseDouble(parts[3]);
				double avg = (s1 + s2 + s3) / 3;
				line += "," + avg + "\n";
				bWriter.append(line);
				System.out.println("名字：" + parts[0] + "；成绩1：" + parts[1] + "；成绩2：" + parts[2] + "；成绩3:" + parts[3] + "；平均成绩：" + avg);
			}
			bWriter.flush();
			
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
