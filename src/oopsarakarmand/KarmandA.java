package oopsarakarmand;

import  java.util.Scanner;
public class KarmandA extends Karmand{
	private double idcode;
	//////////
	public KarmandA() {}


	public double getIdcode() {
		return idcode;
	}




	public void setIdcode(double idcode) {
		Scanner input=new Scanner(System.in);
		this.idcode = idcode;
		int x=1;
		while (idcode!=0) {
			idcode/=10;
			x++;
		}
		if(x>8) {
			System.out.println("try again");
			setIdcode(input.nextDouble());
		}
	}
	
	
	public void printAll() {
		super.printAll();
		System.out.println(idcode);
	}
	public void readAll() {
		Scanner input = new Scanner (System.in);
		super.readAll();
		System.out.println("idcode");
		setIdcode(input.nextDouble());
	}
	
	
}
