package test;

public class Circle {

	 double rad = 1.0;
	
	 public Circle() {
		 
	 }
	 
	 public Circle(double newRad) {
		 rad = newRad;
	 }
	 
	public double getArea() {
	
		return rad * rad * Math.PI;
	}
	}

