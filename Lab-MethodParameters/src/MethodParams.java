
public class MethodParams {

	public static void main(String[] args) {
		
		// create a class instance
		
		MethodParams mp = new MethodParams();
		
		// call method here
		int num = 44;
		double d = mp.convertIntToDouble(num);
		System.out.println(d);
		
		// call second method here
		double d2 = mp.sum(1.0, 2, 3);
		System.out.println(d2);
		
		float[] arr = mp.square(1, 2, 3, 4);
		System.out.println(arr[1]);
		
		char c = mp.findfirstLetter("abcde", "abcfe");
		System.out.println(c);
		
	}
	
	// create first method here
	public static double convertIntToDouble(int num) {
		return (double)num;
	}
	
	// new sum method here
	public static double sum(double num1, int num2, int num3) {
		return num1 + num2 + num3;
	}
	
	public float[] square(int num1, int num2, int num3, int num4) {
		float[] arr = new float[4];
		arr[0] = (float)(num1*num1);
		arr[1] = (float)(num2*num2);
		arr[2] = (float)(num3*num3);
		arr[3] = (float)(num4*num4);
		return arr;
	}
	
	public static char findfirstLetter(String str1, String str2) {
		char[] a = str1.toCharArray();
		char[] b = str2.toCharArray();
		for (int i=0; i<a.length; i++) {
			if (a[i] == b[i]) {
				continue;
			}
			else {
				if (a[i]<b[i]) {
					return (char)a[i];
				}
				else {
					return (char)b[i];
				}
			}
		}
		return a[0];
	}
}
