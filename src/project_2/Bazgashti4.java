package project_2;

import java.util.Scanner;

public class Bazgashti4 {
	public static int sumdigit(int n) {
		int sum=n%10;
		if (n<10)
			return n;
		else
			return (sum+sumdigit(n/10));
	}
	public static void main(String[] args) {
		Scanner input=new Scanner (System.in);
		System.out.println("adad :");
		int n=input.nextInt();
		System.out.println("sum of digits"+sumdigit(n));
	}

}
