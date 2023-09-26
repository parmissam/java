package project_2;

import java.util.Scanner;

public class Tamrin33 {

	public static void main(String[] args) {
		Scanner input=new Scanner (System.in);
		int x=0,u,y=0,T=0;
		int[] arr1=new int[10];
		for (int r=0; r<arr1.length;r++) 
			{System.out.println("arr1["+r+"]=");
			arr1[r]=input.nextInt();}
		for(int j=1;j<=9;j++) {
			if(arr1[0]==arr1[j])
				y++;}T=arr1[0];
		for(int i=0;i<=9;i++) {
			for(int j=0;j<=9;j++) {
				if(arr1[i]==arr1[j])
					x++;
			}if(x>y)
				T=arr1[i];
			y=x;x=0;
			
		}
		System.out.println("portekrar:"+T);
	}

}
