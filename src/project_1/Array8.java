package project_1;
import java.util.Scanner;
public class Array8 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int tedad, p=0,adad,shomaresh=0 ;
		boolean vojod_darad = false;
		int[] arr1=new int [10];
		for (int i=0; i<arr1.length;i++) 
			{System.out.println("arr1["+i+"]=");
			arr1[i]=input.nextInt();}
		System.out.println("adad:");
		adad=input.nextInt();
		for(int j=0; j<arr1.length;j++) {
			if (arr1[j]==adad) {
				vojod_darad=true;
				break;
			}shomaresh++;}
		if(vojod_darad==true)
			System.out.println("mahal hozor:aar1["+shomaresh+"]");
		else 
			System.out.println("vojod nadarad");

	}

}
