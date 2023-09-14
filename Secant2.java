
public class Secant2 {

	public static void main(String[] args) {
		
		double x = 3;
		double y = 20;
		System.out.printf("%f", (secant(10)- secant(10.001))/(10-10.001));

	}
	public static double secant(double x) {
		
		x = 37*x - .83*Math.pow(x, 2);
		
		return x;
		
	}

}
