package ir.ac.kntu;

public class SimplifiedGameProgram {
				   
	public static void main(String[] argv) {
		Page page = new Page();
		Frog frog1 = new Frog(10, 0);
		Frog frog2 = new Frog(20, 0);
		Cloud cloud1 = new Cloud(15, 20);
		page.addMovableContent(frog1);
		page.addMovableContent(frog2);
		page.addMovableContent(cloud1);

		for (int i = 1;i < 5;i++) {
			PageRenderer.getInstance().render(page);
			Waiter.getInstance().wait(3000); //wait for 5000 epochs
		}
	}
	
}