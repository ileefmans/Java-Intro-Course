package PackageOne;
import PackageTwo.ProtectedSubClass;

public class AccessModifiers {

	public static void main(String[] args) {
		// access class method here
		Person adam = new Person();
		adam.age=15;
		
		System.out.println(adam.age);
		
		ProtectedSubClass psc = new ProtectedSubClass();
		psc.printID();
				
	}
}
