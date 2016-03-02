import java.util.Scanner;


public class C33 {

	public static void main(String[] args) {
		int n = 0;
		Scanner in = new Scanner(System.in);
		System.out.printf("输入数组元素个数:");
		n = in.nextInt();
		System.out.printf("输入数组内容, 空格分隔: ");
		int A[] = new int[n];
		for (int i = 0; i < n; ++i) {
			A[i] = in.nextInt();
		}
		
		boolean symmetric = true;
		for (int i = 0, j = A.length - 1; i < j; ++i, --j) {
			if (A[i] != A[j]) {
				symmetric = false;
				break;
			}
		}
		
		if (symmetric) {
			System.out.println("对称");
		} else {
			System.out.println("不对称");
		}
		in.close();
	}

}
