package Test13;

import java.util.HashSet;


class Worker {
	private String name;
	private int age;
	private double salary;
	private int hash = 0;
	@Override
	public int hashCode() {
		//从String类里偷来的哈希算法
		int h = hash;
	    if (h == 0){
	    	String s = name + age + "";
	        char val[] = s.toCharArray();
	
	        for (int i = 0; i < val.length; i++) {
	            h = 31 * h + val[i];
	        }
	        hash = h;
	    }
	    return h;
	}

	@Override
	public boolean equals(Object obj) {
		Worker w = (Worker)obj;
		if (w.name.equals(this.name) && w.age == this.age)
			return true;
		
		return false;
	}

	public Worker(String name, int age, double salary) {
		super();
		this.name = name;
		this.age = age;
		this.salary = salary;
	}
	
}

public class Test {

	public static void main(String[] args) {
		HashSet<Worker> hashSet = new HashSet<Worker>();
		System.out.println(hashSet.add(new Worker("周老师", 22, 100000000)));
		if (hashSet.add(new Worker("周老师", 22, 10000000)) == false) {
			System.out.println("放入hashset失败, 已存在");
		}
	}

}
