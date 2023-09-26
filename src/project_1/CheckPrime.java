package project_1;
import java.util.Scanner;
public class Tamrin5 {

	public static void main(String[] args) {
		Scanner input=new Scanner (System.in);
		int a,b,c=0,i;
		System.out.print("adad=");
		a=input.nextInt();
		for(i=1;i<=a;i++) {
			if(a%i==0)
				c+=i;}
		if(c>a+1)
			System.out.println("morakab");
		else
			System.out.println("aval");
	}

}
