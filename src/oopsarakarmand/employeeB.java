package oopsarakarmand;

import java.util.Scanner;

public class KarmandB extends Karmand {
	private double payment;
	private double karkard;
	
	public KarmandB () {}
	public double getPayment() {
		return payment;
	}

	public void setPayment(double payment) {
		this.payment = payment;
	}

	public double getKarkard() {
		return karkard;
	}

	public void setKarkard(double karkard) {
		Scanner input=new Scanner (System.in);
		this.karkard = karkard;
		if (karkard>24*31) {
			System.out.println("try again");
			setKarkard(input.nextDouble());
		}
	}
	public void printAll() {
		super.printAll();
		System.out.println(payment);
		System.out.println(karkard);
	}
	public void readAll() {
		Scanner input=new Scanner(System.in);
		super.readAll();
		System.out.println("payment");
		setPayment(input.nextDouble());
		System.out.println("karkard");
		setKarkard(input.nextDouble());
	}

}
