package ir.ac.kntu;

public abstract class Shape {
	private String name;
	private int dimension;
	private double perimeter;
	private double area;
	
	public Shape() {		
	}
	
	public Shape(String name, int dimension) {
		this.name = name;
		this.dimension = dimension;
	}
	
	public abstract double computeArea();
	
	public abstract double computePerimeter();
	
	public final String getName() {
		computeArea();
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getDimension() {
		return dimension;
	}
	
	public void setDimension(int dimension) {
		this.dimension = dimension;
	}
	
	public double getArea() {
		return area;
	}
	
	public void setArea(double area) {
		this.area = area;
	}	

	public double getPerimeter() {
		return perimeter;
	}
	
	public void setPerimeter(double perimeter) {
		this.perimeter = perimeter;
	}	
}