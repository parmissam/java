package project_1;
import java.util.Scanner;
public class Array7 {

	public static void main(String[] args) {
		Scanner input=new Scanner (System.in);
		int i,j,T,tool;
		System.out.println("tool array");
		tool=input.nextInt();
		int[] arr1=new int[tool];
		for (int r=0; r<arr1.length;r++) 
			{System.out.println("arr1["+r+"]=");
			arr1[r]=input.nextInt();}
		for(i=0;i<tool;i++)
			for(j=i+1;j<tool;j++)
				if(arr1[i]>arr1[j])
					{
					T=arr1[i];
					arr1[i]=arr1[j];
					arr1[j]=T;
					}
		for(int p=0;p<arr1.length;p++)
			System.out.print(" "+arr1[p]);
	}

}
