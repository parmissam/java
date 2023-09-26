package project_2;

import java.util.Scanner;

public class Bazgashti3 {
	public static int zarb(int n, int x) {
		if (x==0)
			return 0;
		else
			return(n+(zarb(n,x-1)));
	}
	public static void main(String[] args) {
		Scanner input=new Scanner (System.in);
		System.out.println("adad aval:");
		int n=input.nextInt();
		System.out.println("adad dovom:");
		int x=input.nextInt();
		System.out.println("n.x="+zarb(n,x));
	}

}
