package ir.ac.kntu;

public class EquilateralTriangle extends Triangle {
	double edge;
	
	public EquilateralTriangle(double edge) {
		super("Equilateral Triangle", edge, edge, edge);
		this.edge = edge;
	}
	
	@Override
	public double computeArea() {
		setArea(Math.sqrt(3.0) / 4.0 * getEdge() * getEdge());
		return getArea();
	}
	
	@Override
	public double computePerimeter() {
		setPerimeter(3 * getEdge());
		return getPerimeter();
	}

	@Override
	public boolean isSimilar(Shape2D shape2D) {
		if (shape2D instanceof EquilateralTriangle) {
			return true;
		}
		return false;
	}

	public static EquilateralTriangle read() {
		System.out.println("Equilateral Triangle:");
		System.out.print("Edge: ");
		double edge = ScannerWrapper.getInstance().nextDouble();
		return new EquilateralTriangle(edge);
	}
	
	public double getEdge() {
		return edge;
	}
	
	public void setEdge(double edge) {
		this.edge = edge;
	}
}