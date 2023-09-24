package project_2;

import java.util.Scanner;

public class Tamrin44 {

	public static void main(String[] args) {
		Scanner input=new Scanner (System.in);
		String par;
		int x=0;
		boolean dorosti=true;
		System.out.println("input");
		par=input.nextLine();
		for(int i=par.length()-1;i<par.length();i++) {
			if(par.charAt(x)!=par.charAt(i)) {
				dorosti=false;
				break;
			}
			x++;
		}
		if(dorosti==false)
			System.out.println("no");
		else
			System.out.println("yes");
	}

}
