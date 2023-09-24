package project_1;
import java.util.Scanner;
public class Tamrin6 {

	public static void main(String[] args) {
		Scanner input=new Scanner (System.in);
		int a=0,b=0,c=0,i;
		System.out.print("adad=");
		b=input.nextInt();
		for(i=1;i<=9;i++) {
			System.out.print("adad=");
			a=input.nextInt();
			if(a>b) {
				c=b;}
			else
				{c=a;
				b=c;}
		}System.out.println("min="+c);
	}

}
