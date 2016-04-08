package Test5;

public class Test {

	public static void main(String[] args) {
		// 5、总计800元的工资分成100元，50元，10元三种面值的货币发放，其中至少有5张百元票，编程输出各种组合方案。
		for (int i = 5; i <= 8; ++i) { //100元数量
			for (int j = 0; j <= 16 && i * 100 + j * 50 <= 800; ++j) {
				int left = 800 - (i * 100 + j * 50);
				System.out.println("100元:" + i + "张, 50元:" + j + "张, 10元:" + left / 10 + "张");
			}
		}
	}

}
