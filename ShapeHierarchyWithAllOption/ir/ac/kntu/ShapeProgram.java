package ir.ac.kntu;

import java.util.ArrayList;

public class ShapeProgram {
	enum Option { ELLIPSE, CIRCLE, TRIANGLE, 
				   EQUILATERAL_TRIANGLE, SPHERE, ALL, EXIT, UNDEFINED }
				   
	public static void main(String[] argv) {
		Option option;
		
		Menu.getInstance().printTheMenu();
		
		option = Menu.getInstance().getOption();
		
		while (option != Option.EXIT) {
			handleTheOption(option);
			Menu.getInstance().printTheMenu();
			option = Menu.getInstance().getOption();
		} 
		ScannerWrapper.getInstance().close();
	}
	
	public static void handleTheOption(Option option) {
		switch (option) {
			case ELLIPSE:
				handleEllipse();
				break;
			case CIRCLE:
				handleCircle();
				break;
			case TRIANGLE:
				handleTriangle();
				break;
			case EQUILATERAL_TRIANGLE:
				handleEquilateralTriangle();
				break;
			case SPHERE:
				handleSphere();
				break;
			case ALL:
				handleAll();
				break;
			default:
				System.out.println("Invalid choice!");
				break;
		}
	}
	
	private static void handleAll() {
		ArrayList<Shape> shapes = new ArrayList<Shape>();
		
		shapes.add(Ellipse.read());
		shapes.add(Circle.read());
		shapes.add(Triangle.read());
		shapes.add(EquilateralTriangle.read());
		shapes.add(Sphere.read());
		
		for (Shape shape : shapes) {
			ShapeHandler.getInstance().handleShape(shape);
		}
	}
	
	private static void handleEllipse() {
		Ellipse ellipse = Ellipse.read();
		ShapeHandler.getInstance().handleShape(ellipse);
	}

	private static void handleCircle() {
		Circle circle = Circle.read();
		ShapeHandler.getInstance().handleShape(circle);
	}

	private static void handleTriangle() {
		Triangle triangle = Triangle.read();
		ShapeHandler.getInstance().handleShape(triangle);
	}

	private static void handleEquilateralTriangle() {
		EquilateralTriangle triangle = EquilateralTriangle.read();
		ShapeHandler.getInstance().handleShape(triangle);
	}

	private static void handleSphere() {
		Sphere sphere = Sphere.read();
		ShapeHandler.getInstance().handleShape(sphere);
	}
}