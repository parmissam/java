package ir.ac.kntu;

import java.util.function.IntBinaryOperator;
import java.util.function.IntConsumer;
import java.util.function.IntPredicate;
import java.util.function.IntUnaryOperator;
import java.util.stream.IntStream;

public class LambdaStreams1 {
	
	public static void main(String[] args) {

		int[] values = { 3, 10, 6, 1, 4, 8, 2, 5, 9, 7 };

		// display original values
		System.out.print("Original values: ");
		IntStream.of(values).forEach(new IntConsumer() {
			
			@Override
			public void accept(int value) {
				System.out.print(value + " ");
			}
		});
				
		IntStream.of(values).forEach(value -> System.out.print(value + " "));
		System.out.println();

		// count, min, max, sum and average of the values
		System.out.println("\nCount: " + IntStream.of(values).count());
		System.out.println("\nMax: " + IntStream.of(values).max().getAsInt());
		System.out.println("\nMin: " + IntStream.of(values).min().orElse(0));
		System.out.println("\nSum: " + IntStream.of(values).sum());
		System.out.println("\nAverage: " + IntStream.of(values).average().getAsDouble());

		// sum of values with reduce method
		System.out.println("\nSum via reduce method: " + IntStream.of(values).reduce(0, new IntBinaryOperator() {
			
			@Override
			public int applyAsInt(int x, int y) {
				return x + y;
			}
			
		}));

		// sum of squares of values with reduce method
		System.out.println("Sum of squares via reduce method: " + IntStream.of(values).reduce(0, (x, y) -> x + y * y));

		// product of values with reduce method
		System.out.println("Product via reduce method: " + IntStream.of(values).reduce(1, (x, y) -> x * y));

		// even values displayed in sorted order
		System.out.println("\nEven values displayed in sorted order: ");
		IntStream.of(values).filter(new IntPredicate() {
			
			@Override
			public boolean test(int value) {
				return value % 2 == 0;
			}
			
		}).sorted().forEach(value -> System.out.print(value + " "));
		System.out.println();

		// odd values multiplied by 10 and displayed in sorted order
		System.out.println("Odd values multiplied by 10 displayed in sorted order: ");
		IntStream.of(values).filter(value -> value % 2 != 0).map(new IntUnaryOperator() {
			
			@Override
			public int applyAsInt(int value) {
				return value * 10;
			}
			
		}).sorted().forEach(value -> System.out.println(value + " "));
		System.out.println();

		// sum range of integers from 1 to 10, exclusive
		System.out.println("\nSum of integers from 1 to 9: " + IntStream.range(1, 10).sum());

		// sum range of integers from 1 to 10, inclusive
		System.out.println("Sum of integers from 1 to 10: " + IntStream.rangeClosed(1, 10).sum());
	}
} 
