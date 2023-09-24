package oop2;

import java.util.Scanner;

public class Student {
	private double avg;
	private String Name;
	public Student(String Name, double avg) {
		setAvg(avg);
		setName(Name);
	}
	public Student() {}

	public String getName() {
		return Name;
	}

	public void setName(String Name) {
		this.Name = Name;
		//control
		
	}

	public double getAvg() {
		return avg;
	}

	public void setAvg(double avg) {
		this.avg = avg;
		//control
	}
	public void printAll() {
		System.out.println(Name);
		System.out.println(avg);
	}
	public void readAll() {
		Scanner input=new Scanner (System.in);
		setName(input.next());
		setAvg(input.nextDouble());
	}
}
