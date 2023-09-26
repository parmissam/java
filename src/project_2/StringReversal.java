package project_2;

import java.util.Scanner;

public class Bazgashti5 {
	public static String makos(String n) {
		if (n.isEmpty())
			return n;
		else
			{return makos (n.substring(1,n.length()))+n.charAt(0);}
	}
	public static void main(String[] args) {
		Scanner input=new Scanner (System.in);
		System.out.println("reshte :");
		String n=input.next();
		System.out.println(makos(n));
	}

}
