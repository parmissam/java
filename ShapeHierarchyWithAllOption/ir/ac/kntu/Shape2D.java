package ir.ac.kntu;

public abstract class Shape2D extends Shape {

	int edgeNum;
	
	public Shape2D(String name, int edgeNum) {
		super(name, 2);
		this.edgeNum = edgeNum;
	}
	
	public int getEdgeNum() {
		return edgeNum;
	}
	
	public void setEdgeNum(int edgeNum) {
		this.edgeNum = edgeNum;
	}
	
	public abstract boolean isSimilar(Shape2D shape2D);
}