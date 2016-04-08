package Test9;

abstract class Animal {
	private String name;
	public Animal(String name) {
		super();
		this.name = name;
	}
	public abstract void speak();
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}

interface Pet {
	void eat();
}


class Cat extends Animal implements Pet {

	public Cat(String name) {
		super(name);
	}

	public void eat() {		
		System.out.println("I want to eat some fish");
	}

	public void speak() {
		System.out.println("miao，my  name is " + this.getName());
	}
	
}

public class Test {

	public static void main(String[] args) {
		Cat cat = new Cat("周爸爸");
		cat.speak();
		cat.eat();
	}

}
