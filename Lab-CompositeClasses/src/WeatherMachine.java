
public class WeatherMachine {

	Thermometer thermometer = new Thermometer();
	
	private int[] getPastTemperatures() {
		int[] arr = new int[24];
		for (int i=0; i<arr.length; i++) {
			arr[i] = thermometer.record();
		}
		return arr;
	}
	
	public void getWeatherReport() {
		System.out.println(getPastTemperatures()[2]);
	}
}
