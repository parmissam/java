package project_1;
import java.util.Scanner;
public class Array5 {

	public static void main(String[] args) {
		Scanner input=new Scanner (System.in);
		int tedad, adad ;
		boolean vojod_darad = false;
		System.out.println("adad:");
		adad=input.nextInt();
		System.out.print("tool array:");
		tedad=input.nextInt();
		int[] arr1=new int[tedad];
		for (int i=0; i<arr1.length;i++) 
			{System.out.println("arr1["+i+"]=");
			arr1[i]=input.nextInt();
			if (arr1[i]==adad) {
				vojod_darad=true;
			}}
		if(vojod_darad==true)
			System.out.println("vojod darad");
		else 
			System.out.println("vojod nadarad");
	}

}
