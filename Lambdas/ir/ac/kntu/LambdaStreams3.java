package ir.ac.kntu;

import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Collectors;

public class LambdaStreams3 {
	public static void main(String[] args) {
		String[] strings = { "Red", "orange", "Yellow", "green", "Blue", "indigo", "Violet" };

		// display original strings
		System.out.println("Original strings: " + Arrays.asList(strings));

		// strings in uppercase
		//Using Anonymous interface
		System.out.println("strings in uppercase: " +
				Arrays.stream(strings).map(new Function<String, String>() {
					
					@Override
					public String apply(String s) {
						return s.toUpperCase();
					}
					
				}).collect(Collectors.toList()));
		//Using lambda
		System.out.println("strings in uppercase: " +
				Arrays.stream(strings).map(s -> s.toUpperCase()).collect(Collectors.toList()));
		//Using method reference
		System.out.println("strings in uppercase: " +
				Arrays.stream(strings).map(String::toUpperCase).collect(Collectors.toList()));

		// strings greater than "m" (case insensitive) sorted ascending
		System.out.println("strings greater than m sorted ascending: " +
				Arrays.stream(strings).filter(s -> s.compareToIgnoreCase("m") > 0).sorted(String.CASE_INSENSITIVE_ORDER)
						.collect(Collectors.toList()));

		// strings greater than "m" (case insensitive) sorted descending
		System.out.println("strings greater than m sorted descending: " +
				Arrays.stream(strings).filter(s -> s.compareToIgnoreCase("m") > 0)
						.sorted(String.CASE_INSENSITIVE_ORDER.reversed()).collect(Collectors.toList()));
	}
} 