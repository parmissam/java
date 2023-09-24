package project_1;
import java.util.Scanner;
public class Array2 {

	public static void main(String[] args) {
		Scanner input=new Scanner (System.in);
		int a=0,tool;
		System.out.print("tool array:");
		tool=input.nextInt();
		int[] arr1=new int[tool];
		for (int i=0; i<arr1.length;i++) 
			{System.out.println("arr1["+i+"]=");
			arr1[i]=input.nextInt();
			a+=arr1[i];}
		System.out.println(a);
		
	}

}
