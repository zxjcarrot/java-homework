package Test8;

class Person {
	private String name;
	private String sex;
	private int age;
	public Person(String name, String sex, int age) {
		super();
		this.name = name;
		this.sex = sex;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}

class Student extends Person {
	private String major;

	public Student(String name, String sex, int age, String major) {
		super(name, sex, age);
		this.major = major;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}
	
	public String getDetails() {
		return "姓名：" + this.getName() + "，性别：" + this.getSex() + "，年龄：" + this.getAge() + "，专业：" + this.getMajor();
	}
}
public class Test {

	public static void main(String[] args) {
		Student s=new Student("庄敏","女",20,"软件技术");
		System.out.println(s.getDetails());
	}

}
