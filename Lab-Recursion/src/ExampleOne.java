
public class ExampleOne {

	public static void main(String[] args) {
		// create dummy data for our method
		int input = 5;
		ExampleOne eo = new ExampleOne();
		
		
		// call methods here
		System.out.println(eo.factorial(input));
		
		eo.previousLetters('h');
		
		
	}
	
	// create first method here
	public static int factorial(int num) {
		if (num <=0) return 1;
		if (num==1) return 1;
		return num*factorial(num-1);
	}
	
	// create second method here
	public static void previousLetters(char letter) {
		if (letter<'a' || letter>'z') return;
		System.out.println(letter);
		letter-=1;
		previousLetters(letter);
		
	}
	
	
}
