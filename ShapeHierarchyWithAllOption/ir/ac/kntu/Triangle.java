package ir.ac.kntu;

import java.util.ArrayList;
import java.util.Collections;

public class Triangle extends Shape2D {

	double edge1;
	double edge2;
	double edge3;
	
	public Triangle(String name, double edge1, double edge2, double edge3) {
		super(name, 3);
		this.edge1 = edge1;
		this.edge2 = edge2;
		this.edge3 = edge3;
	}
	
	public Triangle(double edge1, double edge2, double edge3) {
		this("Triangle", edge1, edge2, edge3);
	}
	
	@Override
	public double computeArea() {
		double s = computePerimeter() / 2.0;
		setArea(Math.sqrt(s * (s - getEdge1()) * 
							 (s - getEdge2()) * 
							 (s - getEdge3())));
		return getArea();
	}
	
	@Override
	public double computePerimeter() {
		setPerimeter(getEdge1() + getEdge2() + getEdge3());
		return getPerimeter();
	}

	@Override
	public boolean isSimilar(Shape2D shape2D) {
		if (shape2D instanceof Triangle) {
			ArrayList<Double> thisEdges = new ArrayList<Double>();
			thisEdges.add(getEdge1());thisEdges.add(getEdge2());
			thisEdges.add(getEdge3());
			Collections.sort(thisEdges);
			Triangle other = (Triangle)shape2D;
			ArrayList<Double> otherEdges = new ArrayList<Double>();
			otherEdges.add(other.getEdge1());otherEdges.add(other.getEdge2());
			otherEdges.add(other.getEdge3());
			Collections.sort(otherEdges);
			double ratio0 = thisEdges.get(0) / otherEdges.get(0);
			double ratio1 = thisEdges.get(1) / otherEdges.get(1);
			double ratio2 = thisEdges.get(2) / otherEdges.get(2);
			if (ratio0 == ratio1 && ratio1 == ratio2) {
				return true;
			}
		}
		return false;
	}
	
	public static Triangle read() {
		System.out.println("Triangle:");
		System.out.print("Edge #1: ");
		double edge1 = ScannerWrapper.getInstance().nextDouble();
		System.out.print("Edge #2: ");
		double edge2 = ScannerWrapper.getInstance().nextDouble();
		System.out.print("Edge #3: ");
		double edge3 = ScannerWrapper.getInstance().nextDouble();
		return new Triangle(edge1, edge2, edge3);
	}
	
	public double getEdge1() {
		return edge1;
	}
	
	public void setEdge1(double edge1) {
		this.edge1 = edge1;
	}
	
	public double getEdge2() {
		return edge2;
	}
	
	public void setEdge2(double edge2) {
		this.edge2 = edge2;
	}

	public double getEdge3() {
		return edge3;
	}
	
	public void setEdge3(double edge3) {
		this.edge3 = edge3;
	}
}