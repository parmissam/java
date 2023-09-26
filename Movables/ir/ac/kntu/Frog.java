package ir.ac.kntu;

public class Frog extends Enemy {
	static int maxId = 0;
	int id;

	public Frog(double x, double y) {
		setName("Frog");
		setX(x);setY(y);
		id = maxId + 1;
		maxId++;
	}
	
	@Override
	public void move() {
		System.out.println("------------------------------");
		System.out.println("Moving Frog #" + id);
		clear();
		setX(getX() + 3);
		setY(getY() + 5);
		draw();
		Waiter.getInstance().wait(700); //wait for 700 epochs
		clear();
		setX(getX() + 3);
		setY(getY() - 5);
		draw();
		System.out.println("------------------------------");
		System.out.println();
	}

	@Override
	public void draw() {
		//Draw the frog at its current (x, y)
		System.out.println("to <" + getX() + ", " + getY() + ">");
	}

	@Override
	public void clear() {
		//Clear the frog from its current (x, y)
		System.out.print("Moved from <" + getX() + ", " + getY() + "> ");
	}
}