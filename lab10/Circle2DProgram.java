package lab10;

public class Circle2DProgram {
	
	public static void main(String[] args) {

		Circle2D circle1 = new Circle2D(3.0, 1.5, 5);

		System.out.printf("Circle: [x=%.1f, y=%.1f, radius=%.1f]%n", circle1.getX(), circle1.getY(), circle1.getRadius()) ;
		
		System.out.printf(("The area of the circle is: %.2f%n"),circle1.getArea(circle1));
		System.out.printf(("The perimeter of the circle is: %.2f"),circle1.getPerimiter(circle1));

	}
}
