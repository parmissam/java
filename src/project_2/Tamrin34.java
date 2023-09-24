package project_2;

import java.util.Scanner;

public class Tamrin34 {

	public static void main(String[] args) {
		Scanner input=new Scanner (System.in);
		int[] arr1=new int[5];
		int[] arr=new int[5];
		for (int r=0; r<arr1.length;r++) 
			{System.out.println("arr1["+r+"]=");
			arr1[r]=input.nextInt();}
		for (int r=0; r<arr1.length;r++) 
			{System.out.println("arr["+r+"]=");
			arr[r]=input.nextInt();}
		int shomaresh=0;
		for(int i=0;i<=4;i++) {
			for(int j=0;j<=4;j++) {
				if(arr1[i]==arr[j]) {
					shomaresh++;
					break;
				}
			}
		}
		System.out.println("tedad adad motefavet:"+(5-shomaresh));
	}

}
