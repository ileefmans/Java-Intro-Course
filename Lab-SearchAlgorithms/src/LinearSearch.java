
public class LinearSearch {

	public static void main(String[] args) {
		char[] letters = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r','s', 't', 'u', 'v', 'w', 'x', 'y', 'z' };
		
		// call methods here
		LinearSearch ls = new LinearSearch();
		System.out.println(ls.findLetter('h', letters));
		System.out.println(ls.findLetterBackwards('h', letters));
		System.out.println(ls.findLetterFromMiddle('h', letters));
		
	}
	// create first method here
	public static int findLetter(char target, char[] data) {
		if (data==null) return -1;
		int result = -1;
		for (int i = 0; i<data.length; i++) {
			char temp = data[i];
			if (temp==target) {
				return i;
			}
		}
		
		
		return result;
	}
	
	// create second method here
	public static int findLetterBackwards(char target, char[] data) {
		if (data == null) return -1;
		int result = -1;
		for (int i = data.length -1; i>=0; i--) {
			char temp = data[i];
			if (temp == target) {
				return i;
			}
		}
		
		
		return result;
	}
	
	// create third method here
	public static int findLetterFromMiddle(char target, char[] data) {
		if (data == null) return -1;
		int result = -1;
		int count = 0;
		for (int i = data.length/2; i<data.length; i++) {
			char temp1 = data[i];
			if (temp1==target) {
				return i;
			}
			char temp2 = data[data.length/2 - count];
			if (temp2 == target) {
				return data.length/2 - count;
			}
			count++;
			
		}
		return result;

	}
	
}
