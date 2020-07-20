
public class NameGenerator {

	public static void main(String[] args) {
		String[] firstname = {"Adam", "Alexis", "Dennis", "Jose", "Jessica", "Meghan", "Memphis", "Nicky", "Sarah", "William"};
		String[] lastname = {"Adamson", "Bond", "Brown", "Johnson", "Gallagher", "Smith", "Thompson", "Perez", "Snow", "Tran"};
		
		for (int i=0; i<firstname.length; i++) {
			for (int j=0; j<lastname.length; j++) {
				System.out.println(firstname[i]+" " + lastname[j]);
			}
		}
	}
}
