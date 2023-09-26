package ir.ac.kntu;

public abstract class Shape3D extends Shape {

	double volume;
	
	public Shape3D(String name) {
		super(name, 3);
	}

	public abstract double computeVolume();
	
	public double getVolume() {
		return volume;
	}
	
	public void setVolume(double volume) {
		this.volume = volume;
	}
}