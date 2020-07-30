
public class Test {

	public static void main(String[] args) {
		A a = new A();
		
		System.out.println(a.instanceCount);
		System.out.println(A.staticCount);
		
		A a2 = new A();
		
		System.out.println(a2.instanceCount);
		System.out.println(A.staticCount);
		
		a.setInstanceCount(15);
		
		System.out.println(a2.instanceCount);
		System.out.println(a.instanceCount);
		
		A.setStaticCount(12);
		
		System.out.println(A.staticCount);
	}
}
