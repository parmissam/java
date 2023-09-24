package oopsarakarmand;

import java.util.Scanner;
public class Karmand {
	protected String name;
	
	public Karmand () {}
	public String getName() {
		return name;
	}




	public void setName(String name) {
		this.name = name;
	}
	public void readAll() {
		Scanner input=new Scanner(System.in);
		System.out.println("name");
		setName(input.next());
	}
	public void printAll() {
		System.out.println(name);
	}

}