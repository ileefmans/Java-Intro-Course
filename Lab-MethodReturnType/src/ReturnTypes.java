
public class ReturnTypes {

	public static void main(String[] args) {
		
		// create a class instance
		ReturnTypes rt = new ReturnTypes();
		
		// call method here
		rt.doNothing();
		
		boolean b = rt.returnBoolean();
		System.out.println(b);
		
		double pi = rt.returnPi();
		System.out.println(pi);
		
		char[] arr = rt.getAlphabetArray();
		System.out.println(arr);
	}
	
	// create first method
	public static void doNothing() {
		System.out.println("inside void method");
	}
	
	public static boolean returnBoolean() {
		return true;
	}
	
	public static double returnPi() {
		double d = Math.PI;
		return d;
	}
	
	public static char[] getAlphabetArray() {
		char[] arr = {'a', 'b', 'c'};
		return arr;
		
		
	}
}
