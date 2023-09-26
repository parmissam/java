package ir.ac.kntu;

public class Sphere extends Shape3D {

	double radius;
	
	public Sphere(double radius) {
		super("Sphere");
		this.radius = radius;
	}
	
	@Override
	public double computeArea() {
		setArea(4.0 * Math.PI * getRadius() * getRadius());
		return getArea();
	}
	
	@Override
	public double computePerimeter() {
		setPerimeter(2.0 * Math.PI * getRadius());
		return getPerimeter();
	}

	@Override
	public double computeVolume() {
		setVolume(4.0 * Math.PI * getRadius() * getRadius() * getRadius() / 3.0);
		return getVolume();
	}

	public static Sphere read() {
		System.out.println("Sphere:");
		System.out.print("Radius: ");
		double radius = ScannerWrapper.getInstance().nextDouble();
		return new Sphere(radius);
	}
	
	public double getRadius() {
		return radius;
	}
	
	public void setRadius(double radius) {
		this.radius = radius;
	}
}