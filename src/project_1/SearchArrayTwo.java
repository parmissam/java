package project_1;
import java.util.Scanner;
public class Array6 {

	public static void main(String[] args) {
		Scanner input=new Scanner (System.in);
		int tedad, p=0,adad,shomaresh=0 ;
		boolean vojod_darad = false;
		int[] arr2 = new int[10];
		int[] arr1=new int [10];
		for (int i=0; i<arr1.length;i++) 
			{System.out.println("arr1["+i+"]=");
			arr1[i]=input.nextInt();}
		System.out.println("adad:");
		adad=input.nextInt();
		for(int j=0; j<arr1.length;j++) {
			if (arr1[j]==adad) {
				vojod_darad=true;
				arr2[p]=j+1;
				p++;
			}shomaresh++;}
		if(vojod_darad==true)
			for(int a=0;a<arr2.length;a++) {
				if(arr2[a]!=0)
					System.out.println("mahal hozor"+adad+":aar1["+(arr2[a]-1)+"]");}
		else 
			System.out.println("vojod nadarad");
	}

}
