package Test7;

class Box {
	private double length;
	private double width;
	private double height;
	public Box(double length, double width, double height) {
		super();
		this.length = length;
		this.width = width;
		this.height = height;
	}

	public double getVolume() {
		return this.length * this.width * this.height;
	}
}

public class Test {

	public static void main(String[] args) {
		Box b = new Box(1, 2, 3);
		System.out.println("Box的体积:" + b.getVolume());
	}

}
