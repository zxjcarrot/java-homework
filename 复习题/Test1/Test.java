package Test1;

public class Test {

	public static void main(String[] args) {
		//（1）请查找该字符串中字符串“you”最后一次出现的位置；
		String s = "Thank you,i like you,do you like me?";
		int idx = s.lastIndexOf("you");
		System.out.println("字符串“you”最后一次出现的位置:" + idx);
		
		//（2）请统计字符“k”出现的次数；
		int count = 0;
		for (int i = 0; i < s.length(); ++i) {
			if (s.charAt(i) == 'k')
				++count;
		}
		System.out.println("k出现的次数:" + count);

		//（3）截取子串“me”。
		idx = s.indexOf("me");
		String substr = s.substring(idx, idx + 2);
		System.out.println(substr);
	}

}
