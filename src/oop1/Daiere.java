package oop1;

import java.util.Scanner;

public class Daiere {
	//sefat
	private double shoa;
//***********
	//method
	public double mohasebemasahat() {
			return shoa*shoa*3.14;
	}
	
	public void setShoa(double x) {
		Scanner input=new Scanner (System.in);
		while(x<=0) {
			System.out.println("try again");
			x=input.nextDouble();}
		if(x>0)
			shoa=x;
		
	}
	public double getShoa() {
		return shoa;
	}
}
