package ir.ac.kntu;

import java.util.ArrayList;
import java.util.Collections;

public class Tester {

	public static void main(String[] args) {
		ArrayList<ComparableClass> comparableClasses = new ArrayList<ComparableClass>();
		ComparableClass comparableClass = new ComparableClass("Ali", "Mohebbi", 10);
		comparableClasses.add(comparableClass);
		comparableClass = new ComparableClass("Ali", "Mohebbi", 9);
		comparableClasses.add(comparableClass);
		comparableClass = new ComparableClass("Nahid", "Rezai", 15);
		comparableClasses.add(comparableClass);
		comparableClass = new ComparableClass("Nahid", "Alavi", 8);
		comparableClasses.add(comparableClass);
		comparableClass = new ComparableClass("Sarah", "Aryan", 20);
		comparableClasses.add(comparableClass);
		comparableClass = new ComparableClass("Reza", "Aryan", 30);
		comparableClasses.add(comparableClass);
		
		Collections.sort(comparableClasses);
		for (ComparableClass comparable : comparableClasses) {
			System.out.println(comparable);
		}
	}

}
