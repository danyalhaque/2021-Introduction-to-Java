package lab10;

public class CartesianPoint {

	private double x;
	private double y;

	public CartesianPoint() {
		x = 0;
		y = 0;
	}

	public CartesianPoint(double x, double y) {
		this.x = x;
		this.y = y;
	}

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

	public double cartesian() {
				return 0;
		
	}
	
	public double distance(CartesianPoint pt) {
	
		double distance = Math.sqrt(Math.pow((pt.x - x), 2)+Math.pow((pt.y - y), 2));
		return distance;
		
	}
	public double distance(double x, double y) {
		CartesianPoint point2 = new CartesianPoint (x,y);
		double distance = distance(point2);
		
		

		return distance;
	}
	
}
