public class C22 {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		if (2010 % 4 == 0 && 2010 % 100 != 0 || 2010 % 400 == 0) {
			System.out.println("2010是闰年");
		} else {
			System.out.println("2010不是闰年");
		}
	}

}
