package exe7;

public class Cat extends Animal implements Pet {
	private String name;
	public Cat() {
		this("");
	}
	
	public Cat(String name) {
		super(4);
		this.name = name;
	}

	@Override
	public String GetName() {
		return name;
	}

	@Override
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void play() {
		System.out.println("meow, meow!");
	}

	@Override
	public void eat() {
		System.out.println("Cat eat, biaji biaji");
	}

}
