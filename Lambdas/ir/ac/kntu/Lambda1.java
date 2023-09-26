package ir.ac.kntu;

public class Lambda1 {

	public static void main(String[] args) {
		//Anonymous
		Welcomer anonymousWelcomer = new Welcomer() {
			
			@Override
			public void sayWelcome() {
				System.out.println("Hello everybody! I am an anonymous implementation of a functional interface");
			}
		};
		anonymousWelcomer.sayWelcome();

		//Lambda
		Welcomer lambdaWelcomer = () -> { System.out.println("Hello everybody! I am a lambda implementation of a functional interface"); };
		lambdaWelcomer.sayWelcome();
	}

}
