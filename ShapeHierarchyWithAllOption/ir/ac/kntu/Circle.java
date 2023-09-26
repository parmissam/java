package ir.ac.kntu;

public class Circle extends Ellipse {
	double radius;
	
	public Circle(double radius) {
		super("Circle", radius * 2, radius * 2);
		this.radius = radius;
	}
	
	@Override
	public double computeArea() {
		setArea(Math.PI * getRadius() * getRadius());
		return getArea();
	}
	
	@Override
	public double computePerimeter() {
		setPerimeter(2 * Math.PI * getRadius());
		return getPerimeter();
	}

	@Override
	public boolean isSimilar(Shape2D shape2D) {
		if (shape2D instanceof Circle) {
			return true;
		}
		return false;
	}

	public static Circle read() {
		System.out.println("Circle: ");
		System.out.print("Radius: ");
		double radius = ScannerWrapper.getInstance().nextDouble();
		return new Circle(radius);
	}
	
	public double getRadius() {
		return radius;
	}
	
	public void setRadius(double radius) {
		this.radius = radius;
	}
}