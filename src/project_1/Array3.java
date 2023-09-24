package project_1;
import java.util.Scanner;
public class Array3 {

	public static void main(String[] args) {
		Scanner input=new Scanner (System.in);
		int tool,c = 0;
		System.out.print("tool array:");
		tool=input.nextInt();
		int[] arr1=new int[tool];
		System.out.println("arr1[0]");
		arr1[0]=input.nextInt();
		for (int i=1; i<arr1.length;i++) 
			{System.out.println("arr1["+i+"]=");
			arr1[i]=input.nextInt();
			if(arr1[i]>arr1[0]) {
				c=arr1[0];}
			else
				{c=arr1[i];
				arr1[0]=c;}}
		System.out.println("min:"+c);
	}

}
