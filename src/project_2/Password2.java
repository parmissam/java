package project_2;

import java.util.Scanner;

public class Password2 {

	public static void main(String[] args) {
			Scanner input=new Scanner (System.in);
			int x=0;
			String pass,pass2;
			System.out.println("please enter uour password");
			pass=input.next();
			boolean shartasli=false,shart1=false,shart2=false,shart3=false,againtrue=false;
			while(shartasli==false) {
				for(int i=0;i<pass.length();i++) {
					if((pass.charAt(i)<='9'&& pass.charAt(i)>='0'))
						shart1=true;
				}
				for(int i=0;i<pass.length();i++) {
					if((pass.charAt(i)<='z'&& pass.charAt(i)>='a')||(pass.charAt(i)<='Z'&& pass.charAt(i)>='A'))
						shart2=true;
				}
				x=pass.length();
				if(x>=8)
					shart3=true;
				if(shart1==false)
					System.out.println("your password must contain at least one number!");
				if(shart2==false)
					System.out.println("your password must contain at least one character!");
				if(shart3==false)
					System.out.println("your password must contain at least 8 charactersand!");
				if(shart1==false || shart2==false || shart3==false) {
					pass=input.next();
				}
				if(shart1==true && shart2==true && shart3==true) {
					shartasli=true;
				}
				while (againtrue==false && shartasli==true) {
					System.out.println("please enter your password again");
					pass2=input.next();
					if (pass.compareTo(pass2)==0)
						{System.out.println("correct");
						againtrue=true;}
					else
						System.out.println("password dont match");
			}
					
			}
	}

}
