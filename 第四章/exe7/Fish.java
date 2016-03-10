package exe7;

public class Fish extends Animal implements Pet {
	private String name;
	public Fish() {
		super(0);
		name = "";
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
		System.out.println("Look how beautiful I am!");
	}

	@Override
	public void eat() {
		System.out.println("Fish eat, bbbb.");
	}

	@Override
	public void walk() {
		System.out.println("Fish can't walk because they don't have legs");
	}
}
