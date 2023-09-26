package ir.ac.kntu;

import java.util.Arrays;
import java.util.List;
import java.util.Comparator;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class LambdaStreams2 {
	
	public static void main(String[] args) {
		Integer[] values = { 2, 9, 5, 0, 3, 7, 1, 4, 8, 6 };

		// display original values
		System.out.println("Original values: " + Arrays.asList(values));

		// sort values in ascending order with streams
		System.out.println("Sorted values: " + Arrays.stream(values).sorted().collect(Collectors.toList()));

		// values greater than 4
		Predicate<Integer> greaterThan4Filter = value -> value > 4;
		List<Integer> greaterThan4 = Arrays.stream(values).filter(greaterThan4Filter).collect(Collectors.toList());
		System.out.println("Values greater than 4: " + greaterThan4);

		// filter values greater than 4 then sort the results
		System.out.println("Sorted values greater than 4: " +
				Arrays.stream(values).filter(greaterThan4Filter).sorted().collect(Collectors.toList()));

		// filter values greater than 4 then reverse sort the results
		System.out.println("Sorted values (reverse) greater than 4: " +
				Arrays.stream(values).filter(greaterThan4Filter).sorted(Comparator.reverseOrder()).collect(Collectors.toList()));
	}
	
} 

