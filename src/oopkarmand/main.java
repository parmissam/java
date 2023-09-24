package oopkarmand;

public class Asli {

	public static void main(String[] args) {
		Karmand k1= new Karmand();
		Karmand k2= new Karmand();
		k1.readAll();
		k2.readAll();
		if(k1.getTarikh().getYear()>k2.getTarikh().getYear()) 
			System.out.println(k1.getName());
		else if(k1.getTarikh().getYear()<k2.getTarikh().getYear())
			System.out.println(k2.getName());
		else if(k1.getTarikh().getYear()==k2.getTarikh().getYear()) {
			if(k1.getTarikh().getMonth()>k2.getTarikh().getMonth())
				System.out.println(k1.getName());
			else if(k1.getTarikh().getMonth()<k2.getTarikh().getMonth())	
				System.out.println(k2.getName());
			else if(k1.getTarikh().getMonth()==k2.getTarikh().getMonth()) {
				if(k1.getTarikh().getDay()>k2.getTarikh().getDay())
					System.out.println(k1.getName());
				else
					System.out.println(k2.getName());
			}
		}
	}

}
