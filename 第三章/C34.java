import java.util.Scanner;

public class C34 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("输入该整数:");
		long n = in.nextLong();
		int A[] = new int[10];
		
		while (n > 0) {
			A[(int) (n % 10)]++;
			n /= 10;
		}
		
		int max_occ = A[9], max_num = 9;
		for (int i = 9; i >= 0; --i) {
			if (A[i] > max_occ) {
				max_occ = A[i];
				max_num = i;
			}
		}
		
		System.out.println(max_num);
		in.close();
	}

}
