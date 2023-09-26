package ir.ac.kntu;

public class ShapeHandler {

	private static ShapeHandler instance = new ShapeHandler();
	
	private ShapeHandler() {
	}
	
	public static ShapeHandler getInstance() {
		return instance;
	}
				   
	public void handleShape(Shape shape) {
		System.out.println("Data for <" + shape.getName() + ">");
		shape.computePerimeter();
		shape.computeArea();
		System.out.println("Perimeter: " + shape.getPerimeter());
		System.out.println("Area: " + shape.getArea());
		if (shape instanceof Shape3D) {
			Shape3D shape3D = (Shape3D)shape;
			shape3D.computeVolume();
			System.out.println("Volume: " + shape3D.getVolume());
		}
	}
}