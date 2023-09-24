package project_2;
import java.util.Scanner;
public class Tamrin32 {

	public static void main(String[] args) {
		Scanner input=new Scanner (System.in);
		int n,i,j,T;
		int[] arr1=new int[10];
		for (int r=0; r<arr1.length;r++) 
			{System.out.println("arr1["+r+"]=");
			arr1[r]=input.nextInt();}
		for(i=0;i<10;i++)
			for(j=i+1;j<10;j++)
				if(arr1[i]>arr1[j])
					{
					T=arr1[i];
					arr1[i]=arr1[j];
					arr1[j]=T;
					}
		System.out.println("chandomin adad bozorg:");
		n=input.nextInt();
		System.out.println(arr1[10-n]);
	}

}
