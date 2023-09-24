package project_2;
import java.util.Scanner;
public class Tamrin1_asli {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int[]arr=new int[5];
		for(int i=0;i<arr.length; i++) {
			System.out.println("arr["+i+"]:");
			arr[i]=input.nextInt();
		}
		for(int j=0;j<arr.length;j++) {
			System.out.print(arr[j]+",");
		}
	}

}
