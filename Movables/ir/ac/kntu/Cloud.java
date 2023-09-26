package ir.ac.kntu;

public class Cloud implements Movable, Drawable {
	static int maxId = 0;
	int id;

	private double x;
	private double y;

	public Cloud(double x, double y) {
		this.x = x;
		this.y = y;
		id = maxId + 1;
		maxId++;
	}
	
	public void setX(double x) {
		this.x = x;
	}
	
	public double getX() {
		return x;
	}
	
	public void setY(double y) {
		this.y = y;
	}
	
	public double getY() {
		return y;
	}

	@Override
	public void move() {
		System.out.println("------------------------------");
		System.out.println("Moving Cloud #" + id);
		clear();
		setX(getX() + .5);
		setY(getY() - .5);
		draw();
		Waiter.getInstance().wait(500); //wait for 500 epochs
		clear();
		setX(getX() + .5);
		setY(getY() - .5);
		draw();
		Waiter.getInstance().wait(500); //wait for 500 epochs
		clear();
		setX(getX() + .5);
		setY(getY() + 1);
		draw();
		System.out.println("------------------------------");
		System.out.println();
	}

	@Override
	public void draw() {
		//Draw the cloud at its current (x, y)
		System.out.println("to <" + getX() + ", " + getY() + ">");
	}

	@Override
	public void clear() {
		//Clear the cloud from its current (x, y)
		System.out.print("Moved from <" + getX() + ", " + getY() + "> ");
	}
}