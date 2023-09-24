package project_2;

import java.util.Scanner;

public class Tamrin45 {

	public static void main(String[] args) {
		Scanner input=new Scanner (System.in);
		String pass,pass2;
		boolean dorosti=false,againtrue=false,marhale1=false,marhale2=false,marhale3=false,marhale4=false;
		System.out.println("please enter uour password");
		pass=input.next();
		int x=pass.length(),shomaresh=0,hameadad=0;
		for(int i=0;i<pass.length();i++) {
			if((pass.charAt(i)<='9'&& pass.charAt(i)>='0'))
				shomaresh++;
		}
		for(int i=0;i<pass.length();i++) {
			if((pass.charAt(i)<='z'&& pass.charAt(i)>='a')||(pass.charAt(i)<='Z'&& pass.charAt(i)>='A'))
				hameadad++;
		}
		if (shomaresh==0 && x<8 && hameadad==0)
			marhale1=true;
		while (marhale1==true) {
			System.out.println("your password must be at least 8 charactersand it  must contain at least one number!");
			pass=input.next();
			for(int i=0;i<pass.length();i++) {
				if((pass.charAt(i)<='9'&& pass.charAt(i)>='0'))
					shomaresh++;
					}
			x=pass.length();
			for(int i=0;i<pass.length();i++) {
				if((pass.charAt(i)<='z'&& pass.charAt(i)>='a')||(pass.charAt(i)<='Z'&& pass.charAt(i)>='A'))
					hameadad++;
			}
			if (shomaresh>0 || x>=8 || hameadad>0)
				marhale1=false;
		}
		if(shomaresh==0)
			marhale2=true;
		while(marhale2==true) {
			System.out.println("your password must contain at least one number!");
			pass=input.next();
			for(int i=0;i<pass.length();i++) {
				if((pass.charAt(i)<='9'&& pass.charAt(i)>='0'))
					shomaresh++;}
			if(shomaresh>0)
				marhale2=false;
		}
		if (x<8)
			marhale3=true;
		while(marhale3==true) {
			System.out.println("your password must be at least 8 characters!");
			pass=input.next();
			x=pass.length();
			if (x>=8)
				marhale3=false;
		}
		if (hameadad==0)
			marhale4=true;
		while(marhale4==true) {
			System.out.println("your password should contain at least one character");
			for(int i=0;i<pass.length();i++) {
				if((pass.charAt(i)<='z'&& pass.charAt(i)>='a')||(pass.charAt(i)<='Z'&& pass.charAt(i)>='A'))
					hameadad++;
			}
			if (hameadad>0)
				marhale4=false;
		}
		while (againtrue==false) {
			System.out.println("please enter your password again");
			pass2=input.next();
			if (pass.compareTo(pass2)==0)
				{System.out.println("correct");
				againtrue=true;}
			else
				System.out.println("password dont match");
	}}

}
