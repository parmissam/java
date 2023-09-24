package oopkarmand;

import java.util.Scanner;

public class Date {
	private double day;
	private double month;
	private double year;
	public Date() {}
	public double getDay() {
		return day;
	}
	public void setDay(double day) {
		Scanner input= new Scanner (System.in);
		this.day = day;
		if (month<=6&& month>=1) {
			if(day>31) {
				System.out.println("try again");
				setDay(input.nextDouble());
			}
			
		}
		else {
			if(day>30) {
				System.out.println("try again");
				setDay(input.nextDouble());
			}
		}
			
	}
	public double getMonth() {
		return month;
	}
	public void setMonth(double month) {
		this.month = month;
		Scanner input= new Scanner(System.in);
		if (month>12) {
			System.out.println("try again");
			setMonth(input.nextDouble());
		}
	}
	public double getYear() {
		return year;
	}
	public void setYear(double year) {
		this.year = year;
		Scanner input=new Scanner (System.in);
		if (year>1402) {
			System.out.println("try again");
			setYear(input.nextDouble());
		}
	}
	public void printAll() {
		System.out.println(year+"/"+month+"/"+day);
	}
	public void readAll() {
		Scanner input= new Scanner(System.in);
		System.out.println("day");
		setDay(input.nextDouble());
		System.out.println("month");
		setMonth(input.nextDouble());
		System.out.println("year");
		setYear(input.nextDouble());
	}
}
