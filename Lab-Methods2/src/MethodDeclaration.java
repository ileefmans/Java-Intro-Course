
public class MethodDeclaration {

	public static void main(String[] args) {
		
		// create a class instance
		
		MethodDeclaration md = new MethodDeclaration();
		
		// call first method here
		md.talk();
		
		// call second method here
		
		int value = 150;
		int sameValue = md.getInt(value);
		System.out.println(sameValue);
		
		
		// call third method here
		
		System.out.println(md.sum(1, 2, 4.5));
		
		// call fourth method here
		System.out.println(md.randomNumber());
		
	}
	
	// create first method here
	
	public void talk() {
		System.out.println("inside talk() method");
	
	}
	
	public int getInt(int input) {
		
		return input;
		
	}
	
	public double sum(int x, int y, double z) {
		return x+y+z;
	}
	
	public int randomNumber() {
		double d =  50 * (Math.random());
		int value = (int) Math.round(d);
		return value;
	}
}
