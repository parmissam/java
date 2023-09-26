package ir.ac.kntu;

public class Lambda2 {

	public static void main(String[] args) {
		int first = 20, second = 10;
		MathOperation sum = new MathOperation() {
			
			@Override
			public int operation(int first, int second) {
				return first + second;
			}
			
		};
		
		MathOperation sub = (int x, int y) -> { return x - y; };
		MathOperation mul = (int x, int y) -> x * y;
		MathOperation div = (x, y) -> x / y;

		System.out.println("Sum: " + sum.operation(first, second));
		System.out.println("Sub: " + sub.operation(first, second));
		System.out.println("Mul: " + Operartor.operate(first, second, mul));
		System.out.println("Div: " + Operartor.operate(first, second, div));		
	}

}
