package oopzaman;

import java.util.Scanner;

public class Time {
	private double hour;
	private double minute;
	private double second;
	//***********
	public Time() {}
	public Time (double second ,double hour ,double minute) {
		setHour(hour);
	}
	public double getHour() {
		return hour;
	}

	public void setHour(double hour) {
		this.hour = hour;
		Scanner input=new Scanner (System.in);
		if (hour>24) {
			System.out.println("try again");
			setHour(input.nextDouble());
		}
 
	}
	public double getMinute() {
		return minute;
	}
	
	public void setMinute(double minute) {
		this.minute = minute;
		Scanner input=new Scanner (System.in);
		if(minute>60) {
			System.out.println("try again");
			setMinute(input.nextDouble());
		}
	}
	public double getSecond() {
		return second;
	}
	public void setSecond(double second) {
		this.second = second;
		Scanner input=new Scanner (System.in);
		if(second>60) {
			System.out.println("try again");
			setSecond(input.nextDouble());
		}
	}
	public void printAll() {
		System.out.println((int) hour+":"+(int)minute+":"+(int)second);
	}
	public void readAll() {
		Scanner input=new Scanner (System.in);
		System.out.println("hour");
		setHour(input.nextDouble());
		System.out.println("minute");
		setMinute(input.nextDouble());
		System.out.println("second");
		setSecond(input.nextDouble());
	}

}
