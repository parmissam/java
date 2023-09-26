package project_2;

import java.util.Scanner;

public class Tamrin41 {

	public static void main(String[] args) {
		Scanner input=new Scanner (System.in);
		String res;
		System.out.println("enter a word");
		res=input.nextLine();
		int x=res.length()/2;
		if(res.length()%2==0) 
			System.out.println(res.charAt(x-1)+" "+ res.charAt(x));
		else 
			System.out.println(res.charAt(x-1)+" "+ res.charAt(x)+" "+res.charAt(x+1));
	}

}
