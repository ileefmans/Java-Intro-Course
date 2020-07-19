
public class Examples {
	public static void main(String[] args) {
		// initial values
		int i = 200;
		
		
		// cast to short
		short s = (short)i;
		System.out.println(s);
		
		
		// cast to a double
		double d = (double)i;
		System.out.println(d);
		
		
		// cast to a byte - gets rid of bits and represents wrong #
		byte b = (byte)i;
		System.out.println(b);
	}

}
