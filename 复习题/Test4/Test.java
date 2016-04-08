package Test4;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		/*
		 * 4、根据以下公式计算s，n通过命令行输入。s=1+1/(1+2) + 1/(1+2+3) + …+1/(1+2+…+n)
		 * 例如：若n的值为11时，函数的值为1.833333。
		 */
		Scanner in = new Scanner(System.in);
		System.out.print("请输入n:");
		int n = in.nextInt();
		int sum = 0;
		double ans = 0;
		
		for (int i = 1; i <= n; ++i) {
			sum += i;
			ans += 1 / (double)sum;
		}
		System.out.println(ans);
	}

}
