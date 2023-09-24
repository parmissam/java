package oop1;

import java.util.Scanner;

public class Asli1 {

	public static void main(String[] args) {
		Scanner input=new Scanner (System.in);
		Daiere D=new Daiere();
		//D.shoa=2;
		System.out.println("shoa:");
		int d=0;
		d=input.nextInt();
		D.setShoa(d);
		System.out.print(D.mohasebemasahat());
	}

}
