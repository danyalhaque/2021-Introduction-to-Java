
public class Secant {

	public static void main(String[] args) {
		
		double x = 3;
		double y = 20;
		System.out.printf("%f", (secant(3)- secant(2.99))/(2.99-3));

	}
	public static double secant(double x) {
		
		x = Math.pow(x, 2) + x + 8;
		
		return x;
		
	}

}
