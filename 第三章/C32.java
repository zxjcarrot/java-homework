
public class C32 {

	public static void main(String[] args) {
		int b = 1000, eb = 0; // b表示装了汽水的瓶子数, eb表示空瓶数
		int ans = 0; //答案
		int t;
		do {
			ans += b; //喝b瓶
			t = (eb + b) / 3; //换汽水儿 :)
			eb = (eb + b) % 3; //剩余空瓶
			b = t;
		} while (b > 0);
		
		System.out.printf("喝了%d瓶汽水儿, 剩下%d个空瓶子\n", ans, eb);
	}
}
