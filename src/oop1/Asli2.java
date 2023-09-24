package oop1;

import java.util.Scanner;

public class Asli2 {

	public static void main(String[] args) {
		Scanner input=new Scanner (System.in);
		Daiere D1= new Daiere();
		Daiere D2= new Daiere();
		int d1,d2 ;
		System.out.println("shoa:");
		D1.setShoa(d1=input.nextInt());
		System.out.println("shoa2:");
		D2.setShoa(d2=input.nextInt());
		if(D1.getShoa()>D1.getShoa())
			System.out.print(D1.mohasebemasahat());
		else 
			System.out.print(D2.mohasebemasahat());
	}

}
