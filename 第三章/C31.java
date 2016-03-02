
public class C31 {

	public static void main(String[] args) {
		int a, b, c; //分别代表公鸡，母鸡，小鸡的数量
		for (a = 0; a <= 20; ++a) {
			for (b = 0; b <= 33; ++b) {
				c = 100 - a * 5 - b * 3;
				if (a + b + c == 100) {
					System.out.printf("公鸡%d只，母鸡%d只, 小鸡%d只\n", a, b, c);
				}
			}
		}
	}

}
