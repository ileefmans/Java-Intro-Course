
public class Constructors {
	
	public Constructors() {
		System.out.println("default constructor");
	}
	
	public Constructors(int value) {
		System.out.println(value);
	}

	public static void main(String[] args) {
		// create instance here
		
		Constructors c = new Constructors(6848);
		
		Constructors noArg = new Constructors();
		
	}
}
