package exe4;

class Student {
	private String name;
	private int age;
	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	void show() {
		System.out.println("姓名:" + name + ", 年龄:" + age);
	}
}

class Undergraduate extends Student {
	private String degree;
	public Undergraduate(String name, int age, String degree) {
		super(name, age);
		this.degree = degree;
	}
	
	public void show() {
		super.show();
		System.out.println("学历:" + degree);
	}
}
public class TestStudent {

	public static void main(String[] args) {
		Student s1 = new Student("周老师", 21);
		s1.show();
		Student s2 = new Undergraduate("周老师", 21, "本科");
		s2.show();
	}

}
