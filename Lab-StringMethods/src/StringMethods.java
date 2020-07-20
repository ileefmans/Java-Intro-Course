
public class StringMethods {

	public static void main(String[] args) {
		String str = "Hello";
		String s = new String("Hello");
		
		
		// use .equals to compare string objects
		System.out.println(str==s);
		System.out.println(str.equals(s));
		
		// use .length() method
		System.out.println(str.length());
		
		// use .indexOf() method
		System.out.println(str.indexOf('H'));
		
		// use .toUpperCase() method
		System.out.println(str.toUpperCase());
		
		// use .toLowerCase() method
		System.out.println(str.toLowerCase());
		
		// use .charAt(int) method
		System.out.println(str.charAt(2));
		
		// use .equalsIgnoreCase(String) method
		System.out.println(str.equalsIgnoreCase("hello"));
		
		// use .substring(int) method
		System.out.println(str.substring(1));
	}
}
