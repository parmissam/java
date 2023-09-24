package project_1;
import java.util.Scanner;
public class Array4 {

	public static void main(String[] args) {
		Scanner input=new Scanner (System.in);
		int  adad,tekrar=0 ;
		int[] arr1=new int[10];
		for (int i=0; i<arr1.length;i++) 
			{System.out.println("arr1["+i+"]=");
			arr1[i]=input.nextInt();}
		System.out.println("adad:");
		adad=input.nextInt();
		for(int j=0;j<10;j++) {
			if (arr1[j]==adad)
				tekrar++;}
		System.out.println("tedad tekrar:"+tekrar);
	}

}
