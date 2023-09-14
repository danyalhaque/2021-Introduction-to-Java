package lab10;

public class CartesianProgram {

	public static void main(String[] args) {
		CartesianPoint point1 = new CartesianPoint (1.5,2.5);
		CartesianPoint point2 = new CartesianPoint (5.5,3.5);
		
		System.out.printf("CartesianPoint1: [x=%.1f, y=%.1f]%n", point1.getX(), point1.getY());
		System.out.printf("CartesianPoint2: [x=%.1f, y=%.1f]%n", point2.getX(), point2.getY());
		
		System.out.println(point1.distance(point2));
		System.out.println(point1.distance(5.5,3.5));	
	}
}
