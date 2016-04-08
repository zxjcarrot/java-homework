package Test3;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("请输入明文:");
		String str = in.next();
		
		if (str.length() > 0) {
			String jiami = str.substring(1) + str.charAt(0);
			System.out.println("加密后:" + jiami);
		}
	}

}
