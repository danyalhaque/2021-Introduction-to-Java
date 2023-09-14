
public class Circle {

	double radius = 1.0;
	Circle circle;
	
	//constructor - zero argument constructor.
	public Circle() {
		
	}
	
	public Circle (Circle circle) {
		this.circle = circle;
		this.radius = circle.radius;
	}
	
	//constructor
	public Circle(double radius) {
		this.radius = radius;
	}
	public double getArea() {
		return radius * radius *Math.PI;
	}
	public double getAreaOfTwo() {
		double area = circle.getArea();
		return area*radius * radius * Math.PI;
	}
}
