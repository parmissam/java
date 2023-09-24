package project_2;

import java.util.Scanner;

public class Tamrin42 {

	public static void main(String[] args) {
		Scanner input=new Scanner (System.in);
		String par;
		System.out.println("input");
		par=input.nextLine();
		int x;
		float a=0,shomaresh=0;
		for(int i=0;i<par.length();i++) {
			if((par.charAt(i)<='9' && par.charAt(i)>='0') )
				{a+=par.charAt(i)-'0';
				shomaresh++;}
		}
		System.out.println("sum:"+(int) a+"  average:"+ a/shomaresh );
	}

}
