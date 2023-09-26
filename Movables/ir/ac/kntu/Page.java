package ir.ac.kntu;

import java.util.ArrayList;

public class Page {

	private ArrayList<Movable> movableContents;
	
	public Page() {
		movableContents = new ArrayList<Movable>();
	}
				   
	public ArrayList<Movable> getMovableContents() {
		return movableContents;
	}
	
	public void addMovableContent(Movable movable) {
		getMovableContents().add(movable);
	}
}