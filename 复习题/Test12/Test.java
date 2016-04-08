package Test12;

import java.util.ArrayList;

class Student {
	private String id;
	private String name;
	private String classNo;
	private String courseNo;
	private int score;
	public Student(String id, String name, String classNo, String courseNo,
			int score) {
		super();
		this.id = id;
		this.name = name;
		this.classNo = classNo;
		this.courseNo = courseNo;
		this.score = score;
	}
	@Override
	public String toString() {
		return "学号：" + id + ", 姓名：" + name + ", 课程号" + courseNo
				+ ", 成绩：" + score;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public String getCourseNo() {
		return courseNo;
	}
	public void setCourseNo(String courseNo) {
		this.courseNo = courseNo;
	}
	
}
public class Test {

	public static void main(String[] args) {
		ArrayList<Student> list = new ArrayList<Student>();
		list.add(new Student("1", "周老师", "1", "java", 100));
		list.add(new Student("1", "周爸爸", "1", "java", 75));
		list.add(new Student("1", "周爷爷", "1", "java", 56));
		list.add(new Student("1", "周祖宗", "1", "java", 77));
		double sum = 0;
		int cnt = 0;
		for (Student s : list) {
			if (s.getCourseNo().equals("java")) {
				sum += s.getScore();
				cnt++;
			}
		}
		System.out.println("java平均分:" + sum / cnt);
		
		
	}

}
