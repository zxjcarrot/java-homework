package exe7;

public class Spider extends Animal {
	
	public Spider() {
		super(8);
	}
	
	public Spider(int legs) {
		super(legs);
	}

	@Override
	public void eat() {
		System.out.println("Spider eats, yum yum");
	}

}
