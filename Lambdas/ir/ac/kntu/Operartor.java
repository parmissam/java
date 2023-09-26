package ir.ac.kntu;

public class Operartor {
		
	public static int operate(int first ,int second, MathOperation op) {
		return op.operation(first, second);
	}

}
