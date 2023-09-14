package lab10;


public class Circle2D {
	private double x;
	private double y;
	private double radius;
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y = y;
	}
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public Circle2D() {
		x = 0;
		y = 0;
		radius = 1;
		
	}
	public Circle2D(double x, double y, double radius) {
		this.x = x;
		this.y = y;
		this.radius = radius;
		
	}
	public double getArea(Circle2D circle) {
		double area = Math.PI * Math.pow(circle.radius, 2);
		
		return area;
		
	}
	public double getPerimiter(Circle2D circle) {
		double area = 2 * Math.PI * circle.radius;
		
		return area;
		
	}
	
}
