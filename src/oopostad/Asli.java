package oopostad;

import java.util.Scanner;

public class Asli {

	public static void main(String[] args) {
		Scanner input=new Scanner (System.in);
		Ostad o=new Ostad();
		Double[] jai=new Double[o.getPayment().length];
		o.readAll();
		int shomaresh=0;
		System.out.println("hoghgh paye");
		double x=input.nextDouble();
		for (int i=0;i<o.getPayment().length;i++) {
			if (o.getPayment()[i]>=x)
				shomaresh++;}
		System.out.println(shomaresh);
		o.tartib();
	}

}
