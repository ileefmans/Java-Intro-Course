
public class StringConcatenation {

	public static void main(String[] args) {
		String beginning = "Hello";
		
		String end = " World";
		String combo = beginning + end;
		
		System.out.println(combo);
		
		long l = 203L;
		System.out.println("the value of l: " + l);
		
		boolean b = true;
		
		System.out.println(b + " is true");
		
		// Order matters
		
		int x = 2;
		int y = 3;
		
		System.out.println("x+y = " + (x + y));
		System.out.println(x + y + "= x+y");
	}
}