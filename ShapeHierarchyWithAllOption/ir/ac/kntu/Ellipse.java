package ir.ac.kntu;

public class Ellipse extends Shape2D {

	double majorAxis;
	double minorAxis;
	
	public Ellipse(String name, double majorAxis, double minorAxis) {
		super(name, 0);
		this.majorAxis = majorAxis;
		this.minorAxis = minorAxis;
	}
	
	public Ellipse(double majorAxis, double minorAxis) {
		super("Ellipse", 0);
		this.majorAxis = majorAxis;
		this.minorAxis = minorAxis;
	}
	
	@Override
	public double computeArea() {
		setArea(Math.PI * getMajorAxis() * getMinorAxis() / 4.0);
		return getArea();
	}
	
	@Override
	public double computePerimeter() {
		setPerimeter(Math.PI * (3 * (getMajorAxis() / 2.0 + getMinorAxis() / 2.0) - 
									Math.sqrt((3 * getMajorAxis() / 2.0 + getMinorAxis() / 2.0) * 
											  (getMajorAxis() / 2.0 + 3 * getMinorAxis() / 2.0))));
		return getPerimeter();
	}

	@Override
	public boolean isSimilar(Shape2D shape2D) {
		if (shape2D instanceof Ellipse) {
			Ellipse other = (Ellipse)shape2D;
			double thisRatio = getMajorAxis() / getMinorAxis();
			double otherRatio = other.getMajorAxis() / other.getMinorAxis();
			return thisRatio == otherRatio;
		}
		return false;
	}

	public static Ellipse read() {
		System.out.println("Ellipse: ");
		System.out.print("Major axis: ");
		double majorAxis = ScannerWrapper.getInstance().nextDouble();
		System.out.print("Minor axis: ");
		double minorAxis = ScannerWrapper.getInstance().nextDouble();
		return new Ellipse(majorAxis, minorAxis);
	}
	
	public double getMajorAxis() {
		return majorAxis;
	}
	
	public void setMajorAxis(double majorAxis) {
		this.majorAxis = majorAxis;
	}
	
	public double getMinorAxis() {
		return minorAxis;
	}
	
	public void setMinorAxis(double minorAxis) {
		this.minorAxis = minorAxis;
	}
}