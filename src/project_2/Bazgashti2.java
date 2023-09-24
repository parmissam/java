package project_2;

import java.util.Scanner;

public class Bazgashti2 {
	public static int fibonachi(int n) {
		if (n==0)
			return 0;
		if(n==1 || n==2)
			return 1;
		else
			return (fibonachi(n-1)+fibonachi(n-2));
	}
	public static void main(String[] args) {
		Scanner input=new Scanner (System.in);
		int x=0;
		System.out.println("n:");
		int n=input.nextInt();
		x=fibonachi(n);
		System.out.println("a(n):"+ fibonachi(n));
	}

}
