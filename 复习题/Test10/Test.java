package Test10;

abstract class Animal {
	protected int legs;
	
	protected Animal(int legs) {
		super();
		this.legs = legs;
	}
	public void walk() {
		System.out.println("This animal walks on " + legs + " legs.");
	}
	public abstract void eat();
}

interface Pet {
	void setName(String name);
	String getName();
	void play();
}

class Spider extends Animal {
	private String name;
	protected Spider(int legs) {
		super(legs);
	}

	public Spider(String name) {
		super(8);
		this.name = name;
	}
	
	public Spider() {
		this("");
	}

	@Override
	public void walk() {
		System.out.println(name + " walks");
	}

	@Override
	public void eat() {
		System.out.println(name + " eats, biaji biaji");
	}
}


class Cat extends Animal implements Pet {
	private String name;

	protected Cat(int legs) {
		super(legs);
		// TODO Auto-generated constructor stub
	}
	
	public Cat(String name) {
		super(4);
		this.name = name;
	}
	
	public Cat() {
		this("");
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void play() {
		System.out.println(name + " plays, xixixi");
	}

	@Override
	public void walk() {
		System.out.println(name + " walks");
	}

	@Override
	public void eat() {
		System.out.println(name + " eats, biaji biaji");
	}
}

public class Test {

	public static void main(String[] args) {
		Cat c = new Cat("Tom");
		Animal a = new Spider();
		Pet p = new Cat();
		
		c.eat();
		c.walk();
		c.play();
		a.walk();
		a.eat();
		p.play();
	}

}
