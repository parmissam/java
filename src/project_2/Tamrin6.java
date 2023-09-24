package project_2;
import java.util.Scanner;
public class Tamrin6 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int tool,c = 0,T;
		System.out.print("tool array:");
		tool=input.nextInt();
		int[] arr1=new int[tool];
		int[] arr2=new int[tool+2];
		for (int i=0; i<arr1.length;i++) 
		{System.out.println("arr1["+i+"]=");
		arr1[i]=input.nextInt();
		arr2[i]=arr1[i];}
		for(c=0;c<tool;c++) {
			for(int j=c+1;j<tool;j++)
				{if(arr1[c]>arr1[j])
					{
					T=arr1[c];
					arr1[c]=arr1[j];
					arr1[j]=T;
					}}}
		for(int p=0;p<tool;p++) {
			if(arr1[tool-1]==arr2[p])
				arr2[tool]=p;
			else if(arr1[tool-2]==arr2[p])
				arr2[tool+1]=p;
		}
		System.out.println("first max:arr1["+arr2[tool]+"]="+arr2[arr2[tool]]);
		System.out.println("second max:arr1["+arr2[tool+1]+"]="+arr2[arr2[tool+1]]);
	}

}
