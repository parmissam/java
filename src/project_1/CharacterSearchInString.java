package project_1;

public class Emt1 {

	public static void main(String[] args) {
		String str = "This is a test";
		char ch='t';
		System.out.println(str.indexOf('i'));
		for (int i=0;i<str.length();i++) {
			if(str.charAt(i)==ch)
				System.out.println("yes");
		}

	}

}
