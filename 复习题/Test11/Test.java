package Test11;

import java.util.Arrays;
import java.util.List;

public class Test {
	public static List<String> bubbleSort(List<String> list) {
		for (int i = 1; i < list.size(); ++i) {
			for (int j = 0; j < list.size() - i; ++j) {
				if (list.get(j).compareToIgnoreCase(list.get(j + 1)) > 0) {
					String t = list.get(j + 1);
					list.set(j + 1, list.get(j));
					list.set(j, t);
				}
			}
		}
		
		return list;
	}
	public static void main(String[] args) {
		List<String> list = Arrays.asList(new String[]{"abc","de","gong","De","abc","Foo","gong"});
		System.out.println(list);
		list = bubbleSort(list);
		System.out.println(list);
	}
}
