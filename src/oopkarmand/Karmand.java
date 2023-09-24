package oopkarmand;

import java.util.Scanner;

public class Karmand {
	private String name;
	private Date tarikh=new Date();
	//+++++++++++++++
	public Karmand() {}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getTarikh() {
		return tarikh;
	}
	public void setTarikh(Date tarikh) {
		this.tarikh = tarikh;
		
	}
	public void readAll() {
		Scanner input=new Scanner (System.in);
		System.out.println("karmand:");
		setName(input.next());
		tarikh.readAll();
	}
	public void printAll() {
		tarikh.printAll();
		System.out.println(name);
	}
}
