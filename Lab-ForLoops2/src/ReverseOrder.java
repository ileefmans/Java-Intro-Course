
public class ReverseOrder {

	public static void main(String[] args) {
		String[] cities = {"Atlanta", "Charlotte", "Dallas", "Los Angeles", "New York", "Orlando", "Philadelphia", "Seattle"};
		
		for (int i = 0; i<= cities.length/2; i++) {
			String temp = cities[cities.length-(i+1)];
			cities[cities.length-(i+1)]	 = cities[i];	
			cities[i] = temp;
		}
		
		for (int i = 0; i< cities.length; i++) {
			System.out.println(cities[i]);
		}

	}

}
