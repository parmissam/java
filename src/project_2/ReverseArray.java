package project_2;
import java.util.Scanner;
public class Tamrin3 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int i=0,j=9,t;
		int[]arr= {1,2,3,4,5,6,7,8,9,10};
		int []arr1=new int[10];
		while(j>=0) {
			arr1[j]=arr[i];
			i++;
			j--;
		}
		System.out.println("reversed:");
		for(int f=0;f<arr.length;f++) {
			System.out.print(arr1[f]+" ");
		}
	}

}
