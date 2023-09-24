package project_1;
import java.util.Scanner;
public class Jalase2 {
	public static void khandan (int a[]) {
		Scanner input=new Scanner (System.in);
		System.out.println("enter array:");
		for (int i=0; i<a.length;i++) 
		{System.out.println("arr1["+i+"]=");
		a[i]=input.nextInt();}
	}
	public static void chap (int a[]) {
		for (int i=0; i<a.length;i++) 
		{System.out.println("arr1["+i+"]="+a[i]);}
	}
	public static int sumarray (int a[]) {
		int sum=0;
		for(int i=0;i<a.length;i++)
			sum+=a[i];
			return sum;
	}
	public static int minarray (int a[]) {
		int min=a[0];
		for(int i=1;i<a.length;i++) {
			if (a[i]<=min)
				min=a[i];
		}return min;
	}
	public static void tedadtekrar (int a[],int b) {
		int shomaresh=0;
		for(int i=0; i<a.length; i++) {
			if(a[i]==b)
				shomaresh++;
		}System.out.println("tedadtekrar:"+shomaresh);
	}
	public static void sort (int a[]) {
		int i,j,T;
		for(i=0;i<a.length;i++)
		for(j=i+1;j<a.length;j++)
		if(a[i]>a[j])
		{
		T=a[i];
		a[i]=a[j];
		a[j]=T;
		}
	}
	public static void main(String[] args) {
		Scanner input=new Scanner (System.in);
		System.out.println("choose one:"+"1.khandan"+"2.chap"+"3.sum array"+"4.min array"+"5.tedadtekrar"+"6.sort");
		int x=1;
		while(x<=6){
			System.out.println("choose one:");
			x=input.nextInt();
			System.out.println("tool array");
			int n=input.nextInt();
			int a[]=new int[n];
			switch(x){
			case 1:
				khandan(a);
				break;
			case 2:
				khandan(a);
				chap(a);
				break;
			case 3:
				khandan(a);
				sumarray(a);
				System.out.println(sumarray(a));
				break;
			case 4:
				khandan(a);
				minarray(a);
				System.out.println(minarray(a));
				break;
			case 5:
				khandan(a);
				System.out.println("adad:");
				int y=input.nextInt();
				tedadtekrar(a,y);
				break;
			case 6:
				khandan(a);
				sort(a);
				for (int i=0; i<a.length;i++) 
				{System.out.println("arr1["+i+"]="+ a[i]);}
			}
		
		}
	}


}
