package project_2;

import java.util.Scanner;

public class Jalase3 {
	public static boolean avali (int a) {
		boolean aval=true;
		for (int i=2; i<=a-1;i++) 
		{if(a%i==0)
			aval=false;
			break;}
	return aval;
	}
	public static void main(String[] args) {
		Scanner input=new Scanner (System.in);
		System.out.println("adad");
		int x,shomaresh=0;
		for (int u=0;u<10;u++) {
			x=input.nextInt();
			if(avali(x)==true)
				shomaresh++;}
			System.out.println(shomaresh);
	}

}
