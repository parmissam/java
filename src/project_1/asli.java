package project_1;
import java.util.Scanner;
public class asli {
	public static void khandan(String  names[]) {
		Scanner input=new Scanner (System.in);
		for (int j = 0; j < names.length ; j++)
	    {
			System.out.println("enter name");
			names[j]=input.next();}
	}
	public static void chap (String names[]) {
		for (int i=0; i<names.length;i++) 
		{System.out.println("arr1["+i+"]="+ names[i]);}
	}
	public static String min (String names[]) {
		String min=names[0];
		for(int i=1;i<names.length;i++) {
			if (names[i].compareTo(min)>0)
				min=names[i];
		}return min;
	}
	public static void tedadtekraresm (String names[],String esm) {
		int sum=0;
		for (int j = 0; j < names.length; j++)
		{
			if( names[j].compareTo(esm)==0)
				sum++;
		}
		System.out.println("tedad tekrar esm :"+sum);
	}
	public static void sort (String names[]) {
		String T;
		int i,j;
		for(i=0;i<names.length;i++)
		for(j=i+1;j<names.length;j++)
		if(names[i].compareTo(names[j])>=0)
		{
		T=names[i];
		names[i]=names[j];
		names[j]=T;
		}
	}
	public static void main(String[] args) {
		Scanner input=new Scanner (System.in);
		int x=1;
		while (x<=5) {
			System.out.println("tedad daneshjo:");
			int n=input.nextInt();
			String names[]= new String[n];
			System.out.println("choose one:"+"1.khandan"+"2.chap"+"3.min"+"4.tedadtekrar"+"5.sort");
			x=input.nextInt();
			switch(x){
			case 1:
				khandan(names);
				break;
			case 2:
				khandan(names);
				chap(names);
				break;
			case 3:
				khandan(names);
				String esm=min(names);
				System.out.println(esm);
				break;
			case 4:
				khandan(names);
				System.out.println("esm mohgaiese shavande:");
				String esm1=input.next();
				tedadtekraresm(names,esm1);
				break;
			case 5:
				khandan(names);
				sort(names);
				for (int i=0; i<names.length;i++) 
					System.out.println("name["+i+"]="+ names[i]);
	
			
	}}


}}
