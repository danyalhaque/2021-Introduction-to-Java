package lab6;

public class TemperatureConverter2 {

	public static double celciusToFarenheit(double celcius) {

		double answerF = ((9.0 / 5) * celcius + 32);
		return answerF;

	}

	public static double farenheitToCelcius(double fahrenheit) {

		double answerC = ((5.0 / 9) * (fahrenheit - 32));
		return answerC;

	}

	public static void main(String[] args) {
		double celcius = 40.00;
		double fahrenheit = 120.00;

		System.out.printf(
				"Celcius  Fahrenheit  |  Fahrenheit  Celcius " + "%n-------------------------------------------%n");
		for (int index = 1; index <= 10; index++) {

			System.out.printf("%.2f	 %-6.2f", celcius, celciusToFarenheit(celcius--));
			System.out.printf("%7s  %-6.2f      %.2f%n", "|", fahrenheit, farenheitToCelcius(fahrenheit));
			fahrenheit -= 10;
		}
	}

}
