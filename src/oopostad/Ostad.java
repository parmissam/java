package oopostad;
import java.util.Scanner;
public class Ostad {
	int n=tedad();
	private String[] names= new String[n];
	private Double[] payment=new Double[n];
	
	public Ostad() {}
	public int tedad () {
		Scanner input=new Scanner (System.in);
		System.out.println("tedad ostad");
		int n=input.nextInt();
		return n;
	}

	public String[] getNames() {
		return names;
	}


	public void setNames(String[] names) {
		this.names = names;
	}
	public Double[] getPayment() {
		return payment;
	}
	public void setPayment(Double[] payment) {
		Scanner input=new Scanner (System.in);
		this.payment = payment;
		for (int i=0;i<n;i++) {
			if (payment[i]<5600000) {
				//5600000 hadaghal hoghogh kargar
				System.out.println("payment["+names[i]+"]is wrong try again");
				payment[i]=input.nextDouble();
				setPayment(payment);
			}}
	}
	public void readAll() {
		Scanner input=new Scanner (System.in);
		for(int i=0;i<n;i++) {
			System.out.println("name");
			names[i]=input.next();
			System.out.println("hoghogh");
			payment[i]=input.nextDouble();}
		setNames(names);
		setPayment(payment);
	}
	public void tartib() {
		Double jai[]=new Double[n];
		String names2[]=new String[n];
		for (int s=0;s<n;s++)
			jai[s]=payment[s];
		int u=0;
		double T;
		int i,j;
		for(i=0;i<n;i++) {
			for(j=0;j<n-i-1;j++) {
				if(payment[j]>payment[j+1])
					{
					T=payment[j];
					payment[j]=payment[j+1];
					payment[j+1]= T;}
				}
			}
		for (int i1=0;i1<n;i1++) {
			if(jai[u]==payment[i1]) {
				names2[i1]=names[u];
				u++;
			}
				
		}
		for(int i1=0;i1<n;i1++)
			System.out.println("tartib("+(i1+1)+")"+names2[i1]);
}
}
