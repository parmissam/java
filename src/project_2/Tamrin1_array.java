package project_2;
import java.util.Scanner;
public class Tamrin1_array {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int arr1[]= {1,2,3,4,5};
		int[] arr = new int[10];
		for(int u=0;u<5;u++) {
			arr[u]=arr1[u];
		}
		for(int i=5; i<arr.length;i++) {
			System.out.println("arr["+i+"]:");
			arr[i]=input.nextInt();	
		}
		for(int j=0; j<arr.length; j++) {
			System.out.print(arr[j]+" ");
		}
		
		
	}

}
