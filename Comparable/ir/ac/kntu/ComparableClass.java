package ir.ac.kntu;

import java.util.Scanner;

public class ComparableClass implements Comparable<ComparableClass> {
	
	String name;
	String familyName;
	int id;
	
	public ComparableClass(String name, String familyName, int id) {
		this.name = name;
		this.familyName = familyName;
		this.id = id;
	}

	@Override
	public int compareTo(ComparableClass other) {
		int familyComparisonResult = familyName.compareTo(other.familyName);
		if (familyComparisonResult != 0) {
			return familyComparisonResult;
		}
		int nameComparisonResult = name.compareTo(other.name);
		if (nameComparisonResult != 0) {
			return nameComparisonResult;
		}
		if (id > other.id) {
			return  1;
		} else if (id < other.id) {
			return -1;
		} else {
			return 0;
		}
	}

	@Override
	public String toString() {
		return id + ": " + name + " " + familyName;
	}
}
