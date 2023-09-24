package project_1;
import java.util.Scanner;

public class Tamrin3 {

	public static void main(String[] args) {
		Scanner input=new Scanner (System.in);
		int a,b=0,c=0,i;
		System.out.print("adad");
		a=input.nextInt();
		b=a;
		if (a<0)
			{a=a*-1;}
		while(b>0)
			{
			b=a/10;
			c=b*10;
			i=a-c;
			a=a/10;
			System.out.println(i);
			}		
	}

}
