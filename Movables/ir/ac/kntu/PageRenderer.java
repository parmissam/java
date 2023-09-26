package ir.ac.kntu;

public class PageRenderer {

	private static PageRenderer instance = new PageRenderer();
	
	private PageRenderer() {
	}
	
	public static PageRenderer getInstance() {
		return instance;
	}
	
	public void render(Page page) {
		for (Movable movable : page.getMovableContents()) {
			movable.move();
		}
	}
}