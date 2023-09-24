package oopsarakarmand;

import java.util.Scanner;

public class Asli {

	public static void main(String[] args) {
		Scanner input =new Scanner (System.in);
		int shomaresh=0;
		System.out.println("tedad karmandA");
		int x=input.nextInt();
		System.out.println("tedad karmandB");
		int y=input.nextInt();
		for(int i=1;i<=x;i++) {
			KarmandA k1=new KarmandA();
			k1.readAll();
			if(k1.getName().compareTo("sara")==0) {
				shomaresh++;
			}
		}
		for(int i=1;i<=y;i++) {
			KarmandB k2=new KarmandB();
			k2.readAll();
			if(k2.getName().compareTo("sara")==0) {
				shomaresh++;
			}
		}
		System.out.println("tedad sara="+shomaresh);
	}

}
