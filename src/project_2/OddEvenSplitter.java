package project_2;
import java.util.Scanner;
public class Tamrin31 {

	public static void main(String[] args) {
		Scanner input=new Scanner (System.in);
		int arr[]=new int[10];
		int p=0,t=0,x=0;
		for(int i=0; i<=9; i++) {
			System.out.println("adad"+i+":");
			arr[i]=input.nextInt();
		}
		for(int j=0;j<=9;j++) {
			if (arr[j]%2==0)
				x++;}
		int fard[]=new int[10-x];
		int zoj[] = new int[x];
		for(int j=0;j<=9;j++) {
			if (arr[j]%2==0)
			{	zoj[p]=arr[j];
				p++;
			}
			else {
				fard[t]=arr[j];
				t++;
			}
		}
		for(int y=0;y<x;y++)
			System.out.println("zoj: "+ zoj[y]+" ,");
		for(int e=0;e<(10-x);e++)
			System.out.println("fard:"+ fard[e]+" ,");
	}

}
