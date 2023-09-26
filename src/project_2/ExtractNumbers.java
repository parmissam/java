package project_2;

import java.util.Scanner;

public class Tamrin43 {

	public static void main(String[] args) {
		Scanner input=new Scanner (System.in);
		String par;
		int x=0;
		System.out.println("input");
		par=input.nextLine();
		int[] arr =new int[par.length()];
		for(int i=0;i<par.length();i++) {
			if((par.charAt(i)<='9' && par.charAt(i)>='0') )
				{arr[x]=par.charAt(i)-'0';
				x++;}
		}
		System.out.println("output:");
		for(int j=0; j<x;j++)
			System.out.print(+arr[j]);
	}

}
