package project_1;
import java.util.Scanner;
public class Tamrin9 {

	public static void main(String[] args) {
		Scanner input=new Scanner (System.in);
		int x,a,b=1,c,i;
		x=input.nextInt();
		a=x-1;
		for(b=1;b<=x;b++) {
			System.out.println();
			for(c=a;c>=1;c--) {
				System.out.print(" ");
			}
			for(i=1;i<=b;i++) {
				System.out.print(" "+i);
		}a--;}
	}

}
